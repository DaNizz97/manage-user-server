package com.danizz.manageuserserver.controller;

import com.danizz.manageuserserver.domain.entity.User;
import com.danizz.manageuserserver.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/get/all")
    public Iterable<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
