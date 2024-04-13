package com.example.simplespringboot.jpa.controller;


import com.example.simplespringboot.jpa.dao.User;
import com.example.simplespringboot.jpa.service.UserServiceImplJpa;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class MainJpaRestController {

    private final UserServiceImplJpa userServiceImplJpa;

    public MainJpaRestController(UserServiceImplJpa userServiceImplJpa){
        this.userServiceImplJpa = userServiceImplJpa;
    }

    @RequestMapping("/jpa/create")
    public int createUser(HttpServletRequest httpServletRequest, @RequestBody User user){
        System.out.println("[create]");
        return 0;
    }


    @RequestMapping("/jpa/select")
    public List<User> selectUsers(HttpServletRequest httpServletRequest){
        System.out.println("[select]");
        List<User> users = userServiceImplJpa.getByUserName("테스트");
        return users;
    }

    @RequestMapping("/jpa/delete")
    public int deleteUser(HttpServletRequest httpServletRequest, @RequestBody User user){
        System.out.println("[delete]");
        return 0;
    }

}
