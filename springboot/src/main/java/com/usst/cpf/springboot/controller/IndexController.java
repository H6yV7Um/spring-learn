/*******************************************************************************
 *  Copyright (C) 2018 iQIYI Holdings, Inc.
 *  All Rights Reserved.
 *
 *  This file is part of cloud service. Unauthorized copy of this file, via any
 *  medium is strictly prohibited. Proprietary and Confidential.
 *
 *  Author(s):
 *      Pufang Cheng <chengpufang_sx@qiyi.com>
 *******************************************************************************/

package com.usst.cpf.springboot.controller;

import com.usst.cpf.springboot.entity.User;
import com.usst.cpf.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/")
    public String greeting() {
        return "Hello World!";
    }

    @RequestMapping("/user")
    public List<User> getUsers() {
        List<User> users = userMapper.findAllUser();
        users.stream().forEach(user -> System.out.println(user));
        return users;
    }
}
