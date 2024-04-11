package com.example.simplespringboot.service;

import com.example.simplespringboot.dao.User;

import java.util.List;

public interface UserService {

    int createUser(String userId, String userName);

    List<User> getByUserName(String name);

    int deleteByUserName(String name);

    int getAllUsers();

}
