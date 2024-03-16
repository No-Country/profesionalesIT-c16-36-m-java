package com.nocountry.professionalIT.service.impl;

import com.nocountry.professionalIT.dto.users.NewUser;
import com.nocountry.professionalIT.entities.UserEntity;
import com.nocountry.professionalIT.mapper.UserMapper;
import com.nocountry.professionalIT.repository.UserRepository;
import com.nocountry.professionalIT.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;




    @Override
    public NewUser getCurrentUser(Authentication authentication) {
        Optional<UserEntity> user = userRepository.findByEmail(authentication.getName());
        NewUser newUser = new NewUser(user.get());
        return newUser;
    }


    @Override
    public ResponseEntity<Object> createUser(NewUser newUser) {
        //UserEntity user = new UserEntity();
        Optional<UserEntity> user1 = userRepository.findByEmail(newUser.getEmail());

        if (user1.isPresent()){
            return new ResponseEntity<>("The user already exists", HttpStatus.NOT_MODIFIED);
        }

        UserEntity user = userMapper.toSaveEntity(newUser);
        userRepository.save(user);


        return new ResponseEntity<>(
                "User created successfully",
                HttpStatus.CREATED
        );
    }

    @Override
    public ResponseEntity<?> updateUser(NewUser newUser, Authentication authentication) {
        return null;
    }

    @Override
    public UserEntity saveUser(UserEntity user) {
        return userRepository.save(user);
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

    /**
     * Carga los detalles de un usuario por su nombre de usuario (en este caso, el correo electrónico).
     * @param username El nombre de usuario (correo electrónico) del usuario.
     * @return UserDetails que representa los detalles del usuario.
     * @throws UsernameNotFoundException Si no se encuentra un usuario con el correo electrónico proporcionado.
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }

    //devolver todos los correos de los usuarios administradores
    @Override
    public List<String> getAllAdminEmails(){
        return null;
    }
}
