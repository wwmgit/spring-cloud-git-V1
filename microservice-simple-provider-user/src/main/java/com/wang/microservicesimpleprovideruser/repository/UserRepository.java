package com.wang.microservicesimpleprovideruser.repository;

import com.wang.microservicesimpleprovideruser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2018/2/1 0001.
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
