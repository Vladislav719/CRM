package com.github.vladislav719.service;

import com.github.vladislav719.model.User;

/**
 * Created by Vlad on 21.03.2015.
 */
public interface UserSecurityService {

    public User getUser(String email);

}
