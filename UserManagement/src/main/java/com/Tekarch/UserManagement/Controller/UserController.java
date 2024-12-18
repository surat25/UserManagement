package com.Tekarch.UserManagement.Controller;

import com.Tekarch.UserManagement.Services.UserServiceImpl;
import com.Tekarch.UserManagement.Models.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController


public class UserController {
    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }


    @GetMapping("/user")
    public List<User> getUser(){
    return userService.gerAllUser();
    }

    @PostMapping("/user")
    public User adduser(@RequestBody User user){
        return userService.addUser(user);
    }


}
