package com.wang.microservicesimpleprovideruser.controller;

import com.wang.microservicesimpleprovideruser.entity.User;
import com.wang.microservicesimpleprovideruser.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/2/1 0001.
 */
@RestController
public class UserController {

    @Resource
    private UserRepository userRepository;

    @GetMapping("/simple/{id}")
    public User findById(@PathVariable("id") Long id){
        return userRepository.findOne(id);
    }


}
