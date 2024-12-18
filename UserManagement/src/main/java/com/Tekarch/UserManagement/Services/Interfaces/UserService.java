package com.Tekarch.UserManagement.Services.Interfaces;

import com.Tekarch.UserManagement.Models.User;

import java.util.List;

public interface UserService {

    User addUser (User user);
    List <User> gerAllUser();

}
