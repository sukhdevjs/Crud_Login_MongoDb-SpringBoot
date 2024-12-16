package com.spring.usercrud.controller;

import com.spring.usercrud.model.User;
import com.spring.usercrud.repository.UserRepository;
import com.spring.usercrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class UserController {

    @Autowired
    private UserService userService;

//    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/users")
    public ResponseEntity <List<User>> getAllUsers() {
        List<User> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }
}
