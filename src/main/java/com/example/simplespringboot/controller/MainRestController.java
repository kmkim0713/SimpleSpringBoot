package com.example.simplespringboot.controller;


import com.example.simplespringboot.common.HttpUtility;
import com.example.simplespringboot.dao.User;
import com.example.simplespringboot.service.UserServiceImplJdbcTemplate;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class MainRestController {

    private UserServiceImplJdbcTemplate userServiceImplJdbcTemplate;

    public MainRestController(UserServiceImplJdbcTemplate userServiceImplJdbcTemplate){
        this.userServiceImplJdbcTemplate = userServiceImplJdbcTemplate;
    }

    @RequestMapping("/create")
    public int createUser(HttpServletRequest httpServletRequest, @RequestBody User user){
        System.out.println("[create]");
        return userServiceImplJdbcTemplate.createUser(user.getUserId(), user.getUserName());
    }


    @RequestMapping("/select")
    public List<User> selectUsers(HttpServletRequest httpServletRequest){
        System.out.println("[select]");
        List<User> users = userServiceImplJdbcTemplate.getByUserName("테스트");

        return users;
    }

    @RequestMapping("/delete")
    public int deleteUser(HttpServletRequest httpServletRequest, @RequestBody User user){
        System.out.println("[delete]");
        return userServiceImplJdbcTemplate.deleteByUserName(user.getUserName());
    }


}
