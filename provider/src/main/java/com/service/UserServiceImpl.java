package com.service;

import common.api.UserService;

/**
 * @Date 2023/9/7 16:45
 * @Author XiaoHu
 * @Description
 **/
public class UserServiceImpl implements UserService {
    @Override
    public boolean login(String name, String password) {
        System.out.println("name: "+name+"password: "+password);
        return false;
    }
}
