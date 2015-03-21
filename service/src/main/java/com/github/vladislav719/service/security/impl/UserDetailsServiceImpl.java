package com.github.vladislav719.service.security.impl;

import com.github.vladislav719.model.User;
import com.github.vladislav719.service.UserSecurityService;
import com.github.vladislav719.service.UserService;
import com.github.vladislav719.service.security.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

/**
 * Created by Vlad on 21.03.2015.
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserSecurityService userSecurityService;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userSecurityService.getUser(email);
        // указываем роли для этого пользователя
        Set<GrantedAuthority> roles = new HashSet<>();

        roles.add(new SimpleGrantedAuthority(UserRole.USER.name()));

        UserDetails userDetails = new org.springframework.security.core.userdetails.User(
                user.getLogin(),user.getPassword(),roles);
        return userDetails;

    }


}
