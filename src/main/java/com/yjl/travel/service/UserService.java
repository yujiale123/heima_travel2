package com.yjl.travel.service;

import com.yjl.travel.model.User;


public interface UserService {

    /**
     * 注册用户信息
     * @param user 用户信息
     */
    boolean registUser(User user);

    /**
     * 激活
     * @param code 激活码
     * @return 激活成功为true，否则为false
     */
    boolean active(String code);

    User login(String username, String password);
}
