package com.nocountry.professionalIT.service;

import com.nocountry.professionalIT.entities.UserEntity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.UUID;


public interface UserService extends UserDetailsService {

    UserEntity saveUser(UserEntity user);
    UserEntity updateUser(UserEntity user, UUID userId);
    UserEntity disableUser(UUID userId);
    UserEntity findUserByEmail(String email);
}
