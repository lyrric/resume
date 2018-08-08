package com.web.freemarker.demo.service.impl;

import com.web.freemarker.demo.entity.User;
import com.web.freemarker.demo.mapper.UserMapper;
import com.web.freemarker.demo.service.BaseService;
import com.web.freemarker.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

     @Override
    public User findById(int id){
         return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(User user) {
         user.setPassword(null);
         user.setUsername(null);
        userMapper.updateByPrimaryKeySelective(user);
    }



}
