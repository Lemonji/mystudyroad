package com.meng.study.dao;

import com.meng.study.bean.Permission;

import java.util.List;

public interface PermissionDao {
    int deleteByPrimaryKey(Integer permissionId);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Integer permissionId);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);

    List<String> findByUserid(int id);
}