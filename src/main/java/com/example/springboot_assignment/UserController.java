package com.example.springboot_assignment;

import org.apache.catalina.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.Media;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("users")
public class UserController {

    Map<String, UserDetail> users;

    @GetMapping
    public String getuser(@RequestParam(value = "page", defaultValue = "1") int page, @RequestParam(value="limit", defaultValue = "50") int limit){
        return "getuser was called with page = "+page+"limt ="+limit;
    }

    @GetMapping(path = "/{Id}"
//            ,
//            produces = {
//            MediaType.APPLICATION_XML_VALUE,
//            MediaType.APPLICATION_JSON_VALUE
//
//    }
    )
    public ResponseEntity<UserDetail> getUser(@PathVariable String Id){
      if(true) throw new UserServiceException("A user service exception is thrown");
        if(users.containsKey(Id)){

          return new ResponseEntity<>(users.get(Id),HttpStatusCode.valueOf(200));
      }
      else{
          return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      }



    }

    @PostMapping
    public ResponseEntity<UserDetail> createUser(@RequestBody UserDetailModel UserDetail){
        UserDetail user1 = new UserDetail();
        user1.setFirstName(UserDetail.getFirstName());
        user1.setLastName(UserDetail.getLastName());
        user1.setEmail(UserDetail.getEmail());

        String Id = UUID.randomUUID().toString();
        user1.setId(Id);
        if(users == null) users = new HashMap<>();
        users.put(Id,user1);
        return new ResponseEntity<UserDetail>(user1,HttpStatusCode.valueOf(200));

    }

    @PutMapping(path = "/{Id}")
    public UserDetail updateUser(@PathVariable String Id, @Validated @RequestBody UpdateuserdetailModel UserDetail){
UserDetail storedUserDetails = users.get(Id);
storedUserDetails.setFirstName(UserDetail.getFirstName());
storedUserDetails.setLastName(UserDetail.getLastName());
users.put(Id,storedUserDetails);
return storedUserDetails;
    }

    @DeleteMapping(path="/{Id}")
    public ResponseEntity<Void> deleteUser(@PathVariable String Id){
        users.remove(Id);
        return ResponseEntity.noContent().build();
    }
}
