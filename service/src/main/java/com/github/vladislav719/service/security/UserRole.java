package com.github.vladislav719.service.security;

/**
 * Created by Vlad on 21.03.2015.
 */
public enum UserRole {

    ADMIN, // собственная администарция
    PARTNER, // франчайзи
    USER, // пользователь ??
    ANONYMOUS, // не залогиненый
    KEEPER; // хранитель

    UserRole() {
    }

}
