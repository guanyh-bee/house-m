create table s_user
(
	id int auto_increment comment '用户ID',
	username varchar(50) not null comment '用户名',
	password varchar(50) null comment '用户密码',
	salt varchar(40) null comment '盐值',
	gmt_create bigint null comment '创建时间',
	gmt_modified bigint null comment '修改时间',
	is_admin int null comment '是否管理员',
	constraint s_user_pk
		primary key (id)
)
comment '用户信息表';

create unique index s_user_username_uindex
	on s_user (username);

