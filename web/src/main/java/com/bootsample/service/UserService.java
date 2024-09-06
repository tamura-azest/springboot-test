package com.bootsample.service;

import com.bootsample.entity.User;
import com.bootsample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
	UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }
}

