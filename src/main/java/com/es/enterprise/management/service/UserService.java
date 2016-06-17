package com.es.enterprise.management.service;

import com.es.enterprise.management.domain.User;
import com.es.enterprise.management.form.UserForm;
import org.apache.el.stream.Optional;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Iterator;

/**
 * Created by fjmora on 17/06/16.
 */
@Service
public interface UserService {

    User getUserById(long id);

    User getUserByEmail(String email);

    Iterable<User> getAllUsers();

    User create(UserForm userForm);
}
