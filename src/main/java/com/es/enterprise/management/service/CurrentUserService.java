package com.es.enterprise.management.service;

import com.es.enterprise.management.config.CurrentUser;
import org.springframework.stereotype.Service;

/**
 * Created by fjmora on 17/06/16.
 */
@Service
public interface CurrentUserService {
    boolean canAccessUser(CurrentUser currentUser, Long userId);
}