package com.example.simplespringboot.jpa.dao;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Getter
@Entity
@Table(name = "tb_user")
public class User {

    // ORM이란 객체와 DB의 테이블이 매핑을 이루는 것
    // JPA에서 DB에 대한 접근을 시도할 때 직접 sql 쿼리문을 만들지 않는다. 
    // 다만 객체를 이용한 메소드를 통해 이를 관리할 뿐
    // Hibernate는 자바 언어를 위한 ORM 프레임워크이다. 
    // Hibernate는 JPA의 구현체로, JPA 인터페이스를 구현하며, 내부적으로 JDBC API를 사용
    // 개발자가 JPA를 사용하면, JPA 내부에서 JDBC API를 사용하여 SQL을 호출하여 DB와 통신한다.
    // app -> ( jpa -> hibernate -> jdbc ) -> db


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "create_dt")
    private LocalDateTime createDt;

}
