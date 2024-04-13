package com.example.simplespringboot.jdbc.service;

import com.example.simplespringboot.jdbc.dao.User;

import java.util.List;

public interface UserService {

    int createUser(String userId, String userName);

    List<User> getByUserName(String name);

    int deleteByUserName(String name);


}
