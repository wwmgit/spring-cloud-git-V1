package com.wang.repository;

import com.wang.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2018/2/1 0001.
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
