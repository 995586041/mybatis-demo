package com.gh.service;

import com.gh.dao.UserDao;
import com.gh.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User queryById(Integer id){
        return userDao.queryById(id);
    }

}
