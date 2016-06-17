package com.es.enterprise.management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by fjmora on 8/04/16.
 */
@Controller
@RequestMapping(value = {"","/"})
public class InitController {

    @RequestMapping(value = {"/","index"})
    public String index(Model model){
        return "login/index";
    }
}
