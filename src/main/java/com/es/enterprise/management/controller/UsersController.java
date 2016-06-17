package com.es.enterprise.management.controller;

import com.es.enterprise.management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by fjmora on 17/06/16.
 */
@Controller
public class UsersController {

    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    public ModelAndView getUsersPage() {
        return new ModelAndView("users", "users", userService.getAllUsers());
    }
}
