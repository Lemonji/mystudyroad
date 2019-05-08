package com.meng.study.service.serviceimpl;

import com.meng.study.bean.Permission;
import com.meng.study.dao.PermissionDao;
import com.meng.study.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PServiceImpl implements PermissionService {
    @Autowired
    private PermissionDao permissionDao;

    @Override
    public int deleteByPrimaryKey(Integer permissionId) {
        return 0;
    }

    @Override
    public int insert(Permission record) {
        return 0;
    }

    @Override
    public int insertSelective(Permission record) {
        return 0;
    }

    @Override
    public Permission selectByPrimaryKey(Integer permissionId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Permission record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Permission record) {
        return 0;
    }

    @Override
    public List<String> findByUserid(int id) {
        return permissionDao.findByUserid(id);
    }
}
