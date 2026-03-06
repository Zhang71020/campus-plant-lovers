package com.campusplant.service;

import java.util.HashMap;
import java.util.Map;

public class UserService {
    private Map<String, String> users;

    public UserService() {
        this.users = new HashMap<>();
    }

    // Method for user registration
    public boolean register(String username, String password) {
        if (users.containsKey(username)) {
            return false; // User already exists
        }
        users.put(username, password);
        return true; // User registered successfully
    }

    // Method for user authentication
    public boolean authenticate(String username, String password) {
        return users.containsKey(username) && users.get(username).equals(password);
    }
}
