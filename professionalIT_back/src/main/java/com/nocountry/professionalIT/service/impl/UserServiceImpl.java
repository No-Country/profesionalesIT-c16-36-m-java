package com.nocountry.professionalIT.service.impl;

import com.nocountry.professionalIT.entities.UserEntity;
import com.nocountry.professionalIT.service.UserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserEntity saveUser(UserEntity user) {
        return null;
    }

    @Override
    public UserEntity updateUser(UserEntity user, UUID userId) {
        return null;
    }

    @Override
    public UserEntity disableUser(UUID userId) {
        return null;
    }

    @Override
    public UserEntity findUserByEmail(String email) {
        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
