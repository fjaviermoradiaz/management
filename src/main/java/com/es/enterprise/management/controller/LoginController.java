package com.es.enterprise.management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by fjmora on 17/06/16.
 */
@Controller
@RequestMapping(value = {"","/login"})
public class LoginController {


    @RequestMapping(value={"/login","index"}, method = RequestMethod.GET)
    public ModelAndView getLoginPage(@RequestParam String error) {
        return new ModelAndView("login","error", error);
    }
}
