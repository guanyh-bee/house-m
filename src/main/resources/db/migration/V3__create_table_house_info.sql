create table house_info
(
    id int auto_increment,
    location varchar(100) null comment '位置',
    houses varchar(100) null comment '楼盘名称',
    area_architecture double not null comment '建筑面积',
    area_room double null comment '套内面积',
    gong_t varchar(100) null comment '公摊',
    is_residence int null comment '是否住宅',
    house_type varchar(30) null comment '户型',
    doorplate varchar(60) not null comment '门牌 ',
    is_placement int null comment '是否安置',
    is_new int null comment '新旧房',
    decoration varchar(100) null comment '装修',
    ping_yue varchar(50) null comment '平跃层',
    buy_price double null comment '购置价格',
    pay_info varchar(100) null comment '资金支付情况',
    trans_company varchar(100) null comment '转让单位',
    trans_price double null comment '转让价格',
    trans_pay varchar(100) null comment '转让资金到位情况',
    house_person varchar(100) null comment '安置户信息',
    move_apply varchar(50) null comment '调动申请人员',
    move_approver varchar(50) null comment '调动审批人员',
    money_account varchar(50) null comment '财务下账人员',
    property_fee varchar(100) null comment '物业费情况',
    constraint house_info_pk
        primary key (id)
);

