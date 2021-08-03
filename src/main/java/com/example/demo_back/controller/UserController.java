package com.example.demo_back.controller;

import com.example.demo_back.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UserController
{
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/validateUser")
    public boolean validateUser(@RequestParam(value = "userName") String userName,
                                @RequestParam(value = "password") String password)
    {
        return userService.validateUser(userName,password);
    }
}
