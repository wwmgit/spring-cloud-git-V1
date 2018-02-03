package com.wang.microservicesimpleconsumermovie.controller;

import com.wang.microservicesimpleconsumermovie.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2018/2/2 0002.
 */
@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${user.userPath}")
    private String userPath;

    @GetMapping("/movie/{id}")
    public User findById(@PathVariable("id") Long id){
        return restTemplate.getForObject(this.userPath + id, User.class);
    }
}
