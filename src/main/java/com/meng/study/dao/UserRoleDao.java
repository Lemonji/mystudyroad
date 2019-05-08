package com.meng.study.dao;

import com.meng.study.bean.UserRole;

public interface UserRoleDao {
    int insert(UserRole record);

    int insertSelective(UserRole record);
}