package com.example.simplespringboot.controller;


import com.example.simplespringboot.common.HttpUtility;
import com.example.simplespringboot.dao.User;
import com.example.simplespringboot.service.UserServiceImplJdbcTemplate;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
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

    @RequestMapping("/select")
    public List<User> select(HttpServletRequest httpServletRequest){
        System.out.println("[select]");
        List<User> users = userServiceImplJdbcTemplate.getByUserName("테스트");

        return users;
    }
}
