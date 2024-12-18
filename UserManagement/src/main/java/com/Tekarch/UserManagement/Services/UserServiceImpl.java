package com.Tekarch.UserManagement.Services;

import com.Tekarch.UserManagement.Models.User;
import com.Tekarch.UserManagement.Repository.UserRepository;
import com.Tekarch.UserManagement.Services.Interfaces.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    public final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> gerAllUser() {
        return userRepository.findAll();
    }
}
