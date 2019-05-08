package com.meng.study.service;

import com.meng.study.bean.User;

public interface UserService {
    int insert(User record);
    int deleteByPrimaryKey(Integer id);
    User selectByPrimaryKey(Integer userId);
    User selectByUsername(String username);
}
