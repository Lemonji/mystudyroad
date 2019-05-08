package com.meng.study.dao;

import com.meng.study.bean.RolePermission;

public interface RolePermissionDao {
    int insert(RolePermission record);

    int insertSelective(RolePermission record);
}