use wiki;
drop table if exists test;
drop table if exists test1;
drop table if exists test2;
drop table if exists testwiki;
create table test(
                      id bigint not null comment 'id',
                      name varchar(50) comment  '名称',
                      ppassword varchar(50) comment '密码',
                      primary key (id)
)engine = innodb default charset = utf8mb4 comment ='测试';