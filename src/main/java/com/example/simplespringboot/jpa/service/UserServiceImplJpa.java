package com.example.simplespringboot.jpa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.simplespringboot.jpa.Repository.UserRepository;
import com.example.simplespringboot.jpa.dao.User;

@Service
public class UserServiceImplJpa implements UserService{

    private final UserRepository userRepository;

    public UserServiceImplJpa(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public int createUser(String userId, String userName) {
        throw new UnsupportedOperationException("Unimplemented method 'createUser'");
    }

    @Override
    public List<User> getByUserName(String name) {
        return userRepository.findByUserName(name);
    }

    @Override
    public int deleteByUserName(String name) {
        throw new UnsupportedOperationException("Unimplemented method 'deleteByUserName'");
    }
    
}
