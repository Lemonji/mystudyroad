package com.meng.study.service;

import com.meng.study.bean.Permission;

import java.util.List;

public interface PermissionService {
    int deleteByPrimaryKey(Integer permissionId);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Integer permissionId);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);

    List<String> findByUserid(int id);
}
