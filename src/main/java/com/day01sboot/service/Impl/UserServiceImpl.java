package com.day01sboot.service.Impl;

import com.day01sboot.mapper.UserMapper;
import com.day01sboot.pojo.User;
import com.day01sboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ Author     ：ShaoWei Sun.
 * @ Date       ：Created in 9:48 2018/12/1
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryById(Long id) {
       return userMapper.queryById(id);
    }
}
