package com.nocountry.professionalIT.utils;


import com.nocountry.professionalIT.service.UserService;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;


import java.io.IOException;

@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter {

    @Value("${jwt.secret}")
    private String JWT_SECRET_KEY;

    @Autowired
    private UserService userService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        try {
            // Verifica si la solicitud está relacionada con la autenticación y, en ese caso, permite el paso sin validar el token
            if (request.getServletPath().contains("/auth")) {
                filterChain.doFilter(request, response);
                return;
            }

            // Extrae el token JWT del encabezado de autorización de la solicitud
            String token = extractToken(request, response, filterChain);

            if (token == null) return;

            // Extrae el nombre de usuario (email) del token JWT.
            String username = extractUsernameFromToken(token);

            // Configura la autenticación en el contexto de seguridad de Spring
            setAuthentication(request, username);

            // Permite que la solicitud continúe su procesamiento
            filterChain.doFilter(request, response);
        } catch (MalformedJwtException e) {
            handleTokenError(response, "Malformed JWT: " + e.getMessage());
        } catch (JwtException e) {
            handleTokenError(response, "JWT Exception: " + e.getMessage());
        }
    }

    private String extractToken(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        String bearerToken = request.getHeader("Authorization");
        if (bearerToken == null || !bearerToken.startsWith("Bearer ")) {
            filterChain.doFilter(request, response);
            return null;
        }

        return bearerToken.replace("Bearer ", "");
    }

    private Claims processToken(String token) {
        return Jwts.parser()
                .setSigningKey(JWT_SECRET_KEY)
                .parseClaimsJws(token)
                .getBody();
    }

    private String extractUsernameFromToken(String token) {
        Claims claims = processToken(token);
        return claims.getSubject();
    }

    private void setAuthentication(HttpServletRequest request, String username) {
        if (username != null & SecurityContextHolder.getContext().getAuthentication() == null) {
            UserDetails userDetails = userService.loadUserByUsername(username);

            UsernamePasswordAuthenticationToken authenticationToken =
                    new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
            authenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));

            SecurityContextHolder.getContext().setAuthentication(authenticationToken);
        }
    }

    private void handleTokenError(HttpServletResponse response, String error) throws IOException {
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        response.setContentType("application/json");
        response.getWriter().write("{\"error\": \"" + error + "\"}hhihii");
    }
}
