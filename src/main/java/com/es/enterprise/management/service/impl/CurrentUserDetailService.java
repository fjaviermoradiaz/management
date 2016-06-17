package com.es.enterprise.management.service.impl;

import com.es.enterprise.management.config.CurrentUser;
import com.es.enterprise.management.domain.User;
import com.es.enterprise.management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


/**
 * Created by fjmora on 17/06/16.
 */
@Service("userDetailsService")
public class CurrentUserDetailService implements UserDetailsService {

    @Autowired
    private UserService userService;


    @Override
    public CurrentUser loadUserByUsername(String email) throws UsernameNotFoundException, DataAccessException {
        User user = userService.getUserByEmail(email);
        if (user == null)
            throw new UsernameNotFoundException(String.format("User with email=%s was not found", email));

        return new CurrentUser(user);
    }
}
