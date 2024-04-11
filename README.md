spring boot 3.x
java 17



# 로컬 mysql 설치
create table mytable(
    id int auto_increment primary key,
    user_id varchar(50) not null,
    user_name varchar(50) not null,
    create_dt timestamp default current_timestamp
);


insert into mytable(user_id,user_name) values ('test_id','테스트');
