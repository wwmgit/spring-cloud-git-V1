package com.wang.microservicesimpleconsumermovie.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by Administrator on 2018/2/1 0001.
 */
public class User implements Serializable {


    private static final long serialVersionUID = -9070319700604332546L;


    private Long id;
    private String name;
    private String username;
    private Integer age;
    private BigDecimal balance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
