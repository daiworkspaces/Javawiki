use wiki;
drop table if exists test;
drop table if exists test1;
drop table if exists test2;
drop table if exists testwiki;
create table test(
                      id bigint not null comment 'id',
                      name varchar(50) comment  '名称',
                      password varchar(50) comment '密码',
                      primary key (id)
)engine = innodb default charset = utf8mb4 comment ='测试';

drop table if exists template_details;
create table  template_details  (
                                    id bigint(50) unsigned NOT NULL AUTO_INCREMENT,
                                    template_sn bigint(50) unsigned NOT NULL COMMENT '模版编号',
                                    template_name varchar(50) NOT NULL DEFAULT '' COMMENT '模版名称',
                                    template_content varchar(1024) NOT NULL DEFAULT '' COMMENT '模版内容',
                                    template_create_account varchar(50) NOT NULL DEFAULT '' COMMENT '模版创建账号',
                                    is_delete int(4) unsigned NOT NULL COMMENT '是否删除 0 否 ，1是',
                                    is_private int(4) unsigned NOT NULL COMMENT '公开/私有 0 公开，1 私有',
                                    create_time datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                                    update_time datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
                                    PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='模版详情表';

use wiki;
insert into test values (1,'wangsan','123456');