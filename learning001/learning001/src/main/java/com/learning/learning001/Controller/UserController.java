package com.learning.learning001.Controller;

import com.learning.learning001.Models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @GetMapping("/users")
    public List<User> usersinfo (){
        List<User> userlist = new ArrayList<>();
        User user1 = new User("nayan","nayan@gmail.com","1234567890");
        userlist.add(user1);
        return userlist;
    }
    @GetMapping("/users/{name}")
    public User userinfo(@PathVariable String name){
        User user1 = new User("nayan","nayan@gmail.com","1234567890");
        user1.setName(name);
        return user1;
    }
}
