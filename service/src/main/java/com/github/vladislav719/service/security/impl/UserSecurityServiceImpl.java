package com.github.vladislav719.service.security.impl;

import com.github.vladislav719.model.User;
import com.github.vladislav719.service.UserSecurityService;
import com.github.vladislav719.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Vlad on 21.03.2015.
 */

@Service
public class UserSecurityServiceImpl implements UserSecurityService {


    @Autowired
    private UserService userService;

    @Override
    public User getUser(String email) {
        return userService.getSecureUserByEmail(email);
    }


}
