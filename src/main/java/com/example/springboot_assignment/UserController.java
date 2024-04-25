package com.example.springboot_assignment;

import org.apache.catalina.User;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.Media;

@RestController
@RequestMapping("users")
public class UserController {

    @GetMapping
    public String getuser(@RequestParam(value = "page", defaultValue = "1") int page, @RequestParam(value="limit", defaultValue = "50") int limit){
        return "getuser was called with page = "+page+"limt ="+limit;
    }

    @GetMapping(path = "/{userId}"
//            ,
//            produces = {
//            MediaType.APPLICATION_XML_VALUE,
//            MediaType.APPLICATION_JSON_VALUE
//
//    }
    )
    public ResponseEntity<UserDetail> getUser(@PathVariable String userId){
        UserDetail user1 = new UserDetail();
        user1.setFirstName("alex");
        user1.setLastName("matt");
        user1.setEmail("alex@gmail.com");
        return new ResponseEntity<UserDetail>(user1,HttpStatusCode.valueOf(200));
    }

    @PostMapping
    public ResponseEntity<UserDetail> createUser(@RequestBody UserDetailModel UserDetail){
        UserDetail user1 = new UserDetail();
        user1.setFirstName(UserDetail.getFirstName());
        user1.setLastName(UserDetail.getLastName());
        user1.setEmail(UserDetail.getEmail());
        return new ResponseEntity<UserDetail>(user1,HttpStatusCode.valueOf(200));

    }

    @PutMapping
    public String updateUser(){
        return "update user was called";
    }

    public String deleteUser(){
        return "delete user was called";
    }
}
