package com.socialMedia.socialMedia.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.socialMedia.socialMedia.User;
import com.socialMedia.socialMedia.service.UserService;
    
    @RestController
@RequestMapping
public class UserController{
    @Autowired
    private UserService userService;

    @GetMapping
    public String getUsers(){
        return "allusers";
    }
    @PostMapping
    public User create(@RequestBody User user){
        return UserService.Create(user);
    }
}   

