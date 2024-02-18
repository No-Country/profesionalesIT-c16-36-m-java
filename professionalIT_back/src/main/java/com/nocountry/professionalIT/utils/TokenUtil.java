package com.nocountry.professionalIT.utils;
import com.nocountry.professionalIT.entities.UserEntity;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


@Service
public class TokenUtil {

    @Value("${jwt.secret}")
    private String JWT_SECRET_KEY;
    private static final long EXPIRATION = 864000000L; // 10 days

    public String generateToken(UserEntity user, String picture) {
        Date issuedAt = new Date(System.currentTimeMillis());
        Date expiryDate = new Date(issuedAt.getTime() + EXPIRATION);  // válido por 10 días

        Map<String, Object> claims = genereteClaims(user, picture);

        return Jwts.builder()
                .setSubject(user.getEmail())
                .addClaims(claims)
                .setIssuedAt(issuedAt)
                .setExpiration(expiryDate)
                .signWith(SignatureAlgorithm.HS256, JWT_SECRET_KEY)
                .compact();
    }

    private Map<String, Object> genereteClaims (UserEntity user, String picture) {
        Map<String, Object> claims = new HashMap<>();
        claims.put("role", user.getRole().name());
        claims.put("email", user.getEmail());
        claims.put("picture", picture);

        return claims;
    }
}
