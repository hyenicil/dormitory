package com.example.dormitory.controller;

import com.example.dormitory.entity.User;
import com.example.dormitory.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/createUser")
    private User createUser (@RequestBody User user){
        return userService.createUser(user);
    }

}
