package com.example.simplespringboot.jdbc.dao;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class User {

    private int id;
    private String userId;
    private String userName;
    private LocalDateTime createDt;
}
