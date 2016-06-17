package com.es.enterprise.management.config;


import com.es.enterprise.management.domain.User;
import com.es.enterprise.management.type.Role;
import org.springframework.security.core.authority.AuthorityUtils;


/**
 * Created by fjmora on 17/06/16.
 */
public class CurrentUser extends org.springframework.security.core.userdetails.User {

    private User user;

    public CurrentUser(User user) {
        super(user.getEmail(), user.getPasswordHash(), AuthorityUtils.createAuthorityList(user.getRole().toString()));
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public Long getId() {
        return user.getId();
    }

    public Role getRole() {
        return user.getRole();
    }

}