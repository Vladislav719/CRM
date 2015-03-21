package com.github.vladislav719.service.impl;

import com.github.vladislav719.dto.UserRegistrationForm;
import com.github.vladislav719.model.User;
import com.github.vladislav719.model.UserInfo;
import com.github.vladislav719.repository.UserRepository;
import com.github.vladislav719.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Vlad on 21.03.2015.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getSecureUserByEmail(String email) {
        return userRepository.getSecureUserByEmail(email);
    }

    @Override
    public User findByEmail(String email) {
        return null;
    }

    @Override
    public User createUser(UserRegistrationForm userRegistrationForm) {
        return null;
    }

    @Override
    public UserInfo getUserInfo(Long userID) {
        return null;
    }

    @Override
    public UserInfo updateUserInfo(UserInfo userInfo, Long userID) {
        return null;
    }

    @Override
    public List<User> getAllPeopleInSystem() {
        return null;
    }
}
