package com.day01sboot.mapper;

import com.day01sboot.pojo.User;

/**
 * @ Author     ：ShaoWei Sun.
 * @ Date       ：Created in 0:55 2018/12/1
 */
public interface UserMapper {

    User queryById(Long id);
}
