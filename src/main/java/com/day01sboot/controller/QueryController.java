package com.day01sboot.controller;

import com.day01sboot.pojo.User;
import com.day01sboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author     ：ShaoWei Sun.
 * @ Date       ：Created in 9:38 2018/12/1
 */
@RestController
@RequestMapping("user")
public class QueryController {

    @Autowired
    private UserService userService;

    @RequestMapping("query/{id}")
    public User queryById(@PathVariable("id")Long id){
        return  userService.queryById(id);
    }
}
