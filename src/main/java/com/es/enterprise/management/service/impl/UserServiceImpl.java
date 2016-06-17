package com.es.enterprise.management.service.impl;

import com.es.enterprise.management.domain.User;
import com.es.enterprise.management.form.UserForm;
import com.es.enterprise.management.repository.UserRepository;
import com.es.enterprise.management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


/**
 * Created by fjmora on 17/06/16.
 */
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUserById(long id) {
        return userRepository.findOne(id);
    }

    @Override
    public User getUserByEmail(String email) {
        return userRepository.findOneByEmail(email);
    }

    @Override
    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User create(UserForm userForm) {
        User user = new User();
        user.setEmail(userForm.getEmail());
        user.setName(userForm.getName());
        user.setPasswordHash(new BCryptPasswordEncoder().encode(userForm.getPassword()));
        user.setRole(userForm.getRole());

        return userRepository.save(user);
    }

}
