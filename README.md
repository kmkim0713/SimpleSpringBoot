spring boot 3.x
java 17



# 로컬 mysql 설치
create table tb_user(
    id int auto_increment primary key,
    user_id varchar(50) not null,
    user_name varchar(50) not null,
    create_dt timestamp default current_timestamp
);


insert into tb_user(user_id,user_name) values ('test_id','테스트');


# docker mysql vim 설치
microdnf install -y vim

# mysql 한글 깨짐 현상 확인시
# locale 설정 후 재시작 https://0soo.tistory.com/239
docker run --name mysql-test -e MYSQL_ROOT_PASSWORD=1234 -e LC_ALL=C.UTF-8 -p 3306:3306 -it -d mysql:latest
