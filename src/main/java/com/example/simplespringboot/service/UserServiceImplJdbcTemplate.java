package com.example.simplespringboot.service;

import com.example.simplespringboot.dao.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.List;

@Service
@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
public class UserServiceImplJdbcTemplate implements UserService{

    private JdbcTemplate jdbcTemplate;

    public UserServiceImplJdbcTemplate(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }


    @Override
    public int createUser(String userId, String userName) {
        return jdbcTemplate.update("insert into tb_user(user_id, user_name) values(?,?)", userId, userName);
    }

    @Override
    public List<User> getByUserName(String userName) {

        List<User> users = jdbcTemplate.query("select * from tb_user where user_name = ?",
                (resultSet, rowNum) -> {
                    User user = new User();
                    user.setId(resultSet.getInt("id"));
                    user.setUserId(resultSet.getString("user_id"));
                    user.setUserName(resultSet.getString("user_name"));
                    user.setCreateDt(resultSet.getTimestamp("create_dt").toLocalDateTime());
                    return user;
                }, userName);

        return users;
    }

    @Override
    public int deleteByUserName(String userName) {
        return jdbcTemplate.update("delete from tb_user where user_name = ?", userName);
    }

}
