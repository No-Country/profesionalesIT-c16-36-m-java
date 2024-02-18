package com.nocountry.professionalIT.controller;


import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdTokenVerifier;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.gson.GsonFactory;
import com.nocountry.professionalIT.entities.UserEntity;
import com.nocountry.professionalIT.service.UserService;
import com.nocountry.professionalIT.utils.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("api/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @Autowired
    private TokenUtil tokenUtil;


    @PostMapping("/google")
    public ResponseEntity<?> googleAuth(@RequestParam Map<String, String> payload) throws Exception {
        try{
            //obtenemos el googleTokenId de google
            String googleTokenId = payload.get("tokenId");

            //comprobamos que tenga un valor
            if(googleTokenId == null || googleTokenId.isEmpty()){
                throw new Exception("No se ha proporcionado un token");
            }

            //verificamos que sea un token de google válido
            GoogleIdTokenVerifier verifier = new GoogleIdTokenVerifier.Builder(new NetHttpTransport(), new GsonFactory()).build();
            GoogleIdToken idToken = verifier.verify(googleTokenId);

            if(idToken == null){
                throw new Exception("Token de google no válido");
            }

            //obtenemos los datos del usuario de google
            GoogleIdToken.Payload googleUserPayload = idToken.getPayload();

            String email = googleUserPayload.getEmail();
            String name = (String) googleUserPayload.get("given_name");
            String lastName = (String) googleUserPayload.get("family_name");
            String picture = (String) googleUserPayload.get("picture");

            // Verificar si el usuario ya existe en la base de datos
            UserEntity existingUser = userService.findUserByEmail(email);
            if(existingUser == null){
                throw new Exception("Usuario no registrado");
            }

            // El usuario ya existe, verificamos su rol
            String userRole = String.valueOf(existingUser.getRole());

            //verificamos que la cuenta esté activa
            if(existingUser.getStatus() == 0){
                throw new Exception("restricted access");
            }

            // ------Autenticar al usuario en Spring Security--------
            UserDetails userDetails = existingUser;
            UsernamePasswordAuthenticationToken authenticationToken =
                    new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());

            SecurityContextHolder.getContext().setAuthentication(authenticationToken);


            // Creamos el token
            String token = tokenUtil.generateToken(existingUser,picture);


            //construimos la respuesta positiva con el token y los datos del usuario para una fácil disposición en el front
            Map<String, Object> response = new HashMap<>();
            response.put("token", token);
            response.put("email", email);
            response.put("firstName", name);
            response.put("lastName", lastName);
            response.put("photoUrl", picture);
            response.put("role", userRole);
            response.put("authenticationToken", authenticationToken);

            return ResponseEntity.ok(response);
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("{\"error\": \"Token inválido.\"}");
        }
    }

    @PostMapping("/logout")
    public ResponseEntity<?> logout() {
        try {
            SecurityContextHolder.clearContext();
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("{\"error\": \"Error al cerrar sesión.\"}");
        }
    }
}
