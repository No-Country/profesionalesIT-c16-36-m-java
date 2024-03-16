package com.nocountry.professionalIT.service;

import com.nocountry.professionalIT.dto.users.NewUser;
import com.nocountry.professionalIT.entities.UserEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.UUID;


public interface UserService extends UserDetailsService {

    NewUser getCurrentUser(Authentication authentication);
    ResponseEntity<Object> createUser(NewUser newUser);
    ResponseEntity<?> updateUser (NewUser newUser, Authentication authentication);


    UserEntity saveUser(UserEntity user);
    UserEntity updateUser(UserEntity user, UUID userId);
    UserEntity disableUser(UUID userId);
    UserEntity findUserByEmail(String email);
    //devolver todos los correos de los usuarios administradores
    List<String> getAllAdminEmails();
}
