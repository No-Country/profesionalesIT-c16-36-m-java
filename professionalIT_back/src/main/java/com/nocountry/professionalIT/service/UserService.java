package com.nocountry.professionalIT.service;

import com.nocountry.professionalIT.dto.UserDTO;
import com.nocountry.professionalIT.entities.UserEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


public interface UserService extends UserDetailsService {

    UserDTO getCurrentUser(Authentication authentication);
    ResponseEntity<Object> createUser(UserDTO userDto);
    ResponseEntity<?> updateUser (UserDTO userDto, Authentication authentication);


    UserEntity saveUser(UserEntity user);
    UserEntity updateUser(UserEntity user, UUID userId);
    UserEntity disableUser(UUID userId);
    UserEntity findUserByEmail(String email);
    //devolver todos los correos de los usuarios administradores
    List<String> getAllAdminEmails();
}
