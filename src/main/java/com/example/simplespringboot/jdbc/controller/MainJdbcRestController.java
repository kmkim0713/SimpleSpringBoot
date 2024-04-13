package com.example.simplespringboot.jdbc.controller;



import com.example.simplespringboot.jdbc.dao.User;
import com.example.simplespringboot.jdbc.service.UserServiceImplJdbcTemplate;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class MainJdbcRestController {

    private UserServiceImplJdbcTemplate userServiceImplJdbcTemplate;

    public MainJdbcRestController(UserServiceImplJdbcTemplate userServiceImplJdbcTemplate){
        this.userServiceImplJdbcTemplate = userServiceImplJdbcTemplate;
    }

    @RequestMapping("/jdbc/create")
    public int createUser(HttpServletRequest httpServletRequest, @RequestBody User user){
        System.out.println("[create]");
        return userServiceImplJdbcTemplate.createUser(user.getUserId(), user.getUserName());
    }


    @RequestMapping("/jdbc/select")
    public List<User> selectUsers(HttpServletRequest httpServletRequest){
        System.out.println("[select]");
        List<User> users = userServiceImplJdbcTemplate.getByUserName("테스트");

        return users;
    }

    @RequestMapping("/jdbc/delete")
    public int deleteUser(HttpServletRequest httpServletRequest, @RequestBody User user){
        System.out.println("[delete]");
        return userServiceImplJdbcTemplate.deleteByUserName(user.getUserName());
    }

}
