package com.campusplant.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody UserRegistrationDto userDto) {
        // Implementation for user registration
        return ResponseEntity.status(HttpStatus.CREATED).body("User registered successfully");
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody UserLoginDto userDto) {
        // Implementation for user login
        return ResponseEntity.ok("User logged in successfully");
    }
}

class UserRegistrationDto {
    private String username;
    private String password;
    // Getters and Setters
}

class UserLoginDto {
    private String username;
    private String password;
    // Getters and Setters
}