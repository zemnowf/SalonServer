package com.zemno.serverapplication.salonserver.controller;

import com.zemno.serverapplication.salonserver.model.User;
import com.zemno.serverapplication.salonserver.model.UserStatus;
import com.zemno.serverapplication.salonserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public UserStatus login(@RequestBody User user){
        return userService.loginUser(user);
    }

    @PostMapping("/register")
    public boolean register(@RequestBody User user){
        return userService.registerUser(user);
    }

    @GetMapping("/user")
    public User getUser(){
        return userService.getCurrentUser();
    }

    @GetMapping("/users")
    public List<User> getAll(){
        return userService.getAll();
    }

    @PutMapping("/user")
    public void update(@RequestBody User user){
        userService.update(user);
    }

    @PostMapping("/user")
    public boolean add(@RequestBody User user){
        return userService.add(user);
    }

    @DeleteMapping("/user/{id}")
    public void delete(@PathVariable Long id){
        userService.delete(id);
    }
}
