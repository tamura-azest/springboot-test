package com.bootsample.repository;

import org.springframework.stereotype.Repository;

import com.bootsample.entity.User;

@Repository
public interface UserDao {
    User findUserByUserName(String userName);
}
