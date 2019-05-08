package com.tju.myproject.controller;

import com.tju.myproject.entity.User;
import com.tju.myproject.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController
{
    @Autowired
    private UserService userService;
    @PostMapping(value = "/addUser")
    public Integer addUser(@Param("user")User user)
    {
        return userService.addUser(user);
    }
}
