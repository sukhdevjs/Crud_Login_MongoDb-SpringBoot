package com.spring.usercrud.service;


import com.spring.usercrud.model.User;
import com.spring.usercrud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {

        return userRepository.findAll();

//        try {
//            return userRepository.findAll();
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new RuntimeException("Erroer retriving users");
//        }
    }

}

