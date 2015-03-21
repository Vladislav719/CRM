package com.github.vladislav719.repository;

import com.github.vladislav719.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Vlad on 21.03.2015.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    @Query("select distinct user from User user where user.email=?1")
    public User getSecureUserByEmail(String email);
}
