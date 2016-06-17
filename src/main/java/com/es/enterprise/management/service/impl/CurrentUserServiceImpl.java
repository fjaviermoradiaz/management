package com.es.enterprise.management.service.impl;

import com.es.enterprise.management.config.CurrentUser;
import com.es.enterprise.management.service.CurrentUserService;
import com.es.enterprise.management.type.Role;
import org.springframework.stereotype.Service;

/**
 * Created by fjmora on 17/06/16.
 */
@Service
public class CurrentUserServiceImpl implements CurrentUserService {

    @Override
    public boolean canAccessUser(CurrentUser currentUser, Long userId) {
        return currentUser != null
                && (currentUser.getRole() == Role.ADMIN || currentUser.getId().equals(userId));
    }

}