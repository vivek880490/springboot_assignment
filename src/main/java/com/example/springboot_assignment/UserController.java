package com.example.springboot_assignment;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {

    @GetMapping
    public String getuser(@RequestParam(value = "page", defaultValue = "1") int page, @RequestParam(value="limit", defaultValue = "50") int limit){
        return "getuser was called with page = "+page+"limt ="+limit;
    }

    @GetMapping(path = "/{userId}")
    public UserDetail getUser(@PathVariable String userId){
        UserDetail user1 = new UserDetail();
        user1.setFirstName("alex");
        user1.setLastName("matt");
        user1.setEmail("alex@gmail.com");
        return user1;
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
