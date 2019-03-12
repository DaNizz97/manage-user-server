package com.danizz.manageuserserver.controller;

import com.danizz.manageuserserver.domain.entity.User;
import com.danizz.manageuserserver.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/users")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public Iterable<User> getAllUsers() {
        return userService.getAll();
    }

    @GetMapping(path = "/{id}")
    public User getById(@PathVariable Long id) {
        return userService.get(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User create(@RequestBody User user) {
        return userService.save(user);
    }

    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable Long id) {
        userService.deleteById(id);
    }

}
