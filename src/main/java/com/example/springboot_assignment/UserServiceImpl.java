package com.example.springboot_assignment;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    Map<String, UserDetail> users;

    @Override
    public UserDetail createUser(UserDetailModel userDetails) {
        UserDetail user1 = new UserDetail();
        user1.setFirstName(UserDetail.getFirstName());
        user1.setLastName(UserDetail.getLastName());
        user1.setEmail(UserDetail.getEmail());

        String Id = UUID.randomUUID().toString();
        user1.setId(Id);
        if(users == null) users = new HashMap<>();
        users.put(Id,user1);
        return user1;
    }
}
