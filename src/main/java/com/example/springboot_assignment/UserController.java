package com.example.springboot_assignment;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {

    @GetMapping(path = "/{userId}")
    public String getUser(@PathVariable String userId){
        return "get user was called with userId ="+userId;
    }

    @PostMapping
    public String createUser(){
        return "create user was called";

    }

    @PutMapping
    public String updateUser(){
        return "update user was called";
    }

    public String deleteUser(){
        return "delete user was called";
    }
}
