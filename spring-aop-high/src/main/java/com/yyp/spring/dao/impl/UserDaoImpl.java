package com.yyp.spring.dao.impl;

import com.yyp.spring.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {


    public void getUser() {
        System.out.println("获取user");
    }
}
