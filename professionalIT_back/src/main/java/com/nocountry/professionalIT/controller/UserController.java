package com.nocountry.professionalIT.controller;


import com.nocountry.professionalIT.entities.UserEntity;
import com.nocountry.professionalIT.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<UserEntity> saveEUser(@RequestBody UserEntity newUser) {
        return new ResponseEntity<>(userService.saveUser(newUser), HttpStatus.CREATED);
    }

//    @PutMapping("{userId}")
//    public ResponseEntity<UserEntity> updateUser(@PathVariable Long userId, @RequestBody UserEntity updatedUser) {
//        UserEntity updateUser = userService.updateUser(updatedUser, userId);
//
//        if (updateUser != null) {
//            return new ResponseEntity<>(updateUser, HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }

//    @PutMapping("/disable/{userId}")
//    public ResponseEntity<UserEntity> disableUser(@PathVariable Long userId) {
//        UserEntity disableUser = userService.disableUser(userId);
//
//        if (disableUser != null) {
//            return new ResponseEntity<>(disableUser, HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
}

