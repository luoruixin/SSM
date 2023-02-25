package com.luoxiaohei.service.impl;

import com.luoxiaohei.domain.User;
import com.luoxiaohei.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    public void save(User user) {
        System.out.println("user service ...");
    }
}
