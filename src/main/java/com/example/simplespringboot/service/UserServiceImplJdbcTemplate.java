package com.example.simplespringboot.service;

import com.example.simplespringboot.dao.User;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserServiceImplJdbcTemplate implements UserService{

    private JdbcTemplate jdbcTemplate;

    UserServiceImplJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int createUser(String userId, String userName) {
        return jdbcTemplate.update("insert into tb_user(user_id, user_name) values(?,?)", userId, userName);
    }

    @Override
    public List<User> getByUserName(String name) {

        List<User> users = jdbcTemplate.query("select * from tb_user where user_name = ?",
                (resultSet, rowNum) -> {
                    User user = new User();
                    user.setId(resultSet.getInt("id"));
                    user.setUserId(resultSet.getString("user_id"));
                    user.setUserName(resultSet.getString("user_name"));
                    user.setCreateDt(resultSet.getTimestamp("create_dt").toLocalDateTime());
                    return user;
                }, name);

        return users;
    }

    @Override
    public int deleteByUserName(String name) {
        return 0;
    }

    @Override
    public int getAllUsers() {
        return 0;
    }
}
