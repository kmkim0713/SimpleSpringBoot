package com.example.simplespringboot.jpa.service;


import java.util.List;

import com.example.simplespringboot.jpa.dao.User;

public interface UserService {

    int createUser(String userId, String userName);

    List<User> getByUserName(String name);

    int deleteByUserName(String name);


}
