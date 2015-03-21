package com.github.vladislav719.service;

import com.github.vladislav719.dto.UserRegistrationForm;
import com.github.vladislav719.model.User;
import com.github.vladislav719.model.UserInfo;

import java.util.List;

/**
 * Created by Vlad on 21.03.2015.
 */
public interface UserService {

    public User getSecureUserByEmail(String email);

    public User findByEmail(String email);

    public User createUser(UserRegistrationForm userRegistrationForm);

    public UserInfo getUserInfo(Long userID);

    public UserInfo updateUserInfo(UserInfo userInfo, Long userID);

    public List<User> getAllPeopleInSystem();
}
