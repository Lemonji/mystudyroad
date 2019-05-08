package com.meng.study.service.serviceimpl;

import com.meng.study.bean.User;
import com.meng.study.dao.UserDao;
import com.meng.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public int insert(User record) {
        return userDao.insert(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return userDao.deleteByPrimaryKey(id);
    }

    @Override
    public User selectByPrimaryKey(Integer userId){
        return userDao.selectByPrimaryKey(userId);
    }


    @Override
    public User selectByUsername(String username){
        return userDao.selectByusername(username);
    }

}
