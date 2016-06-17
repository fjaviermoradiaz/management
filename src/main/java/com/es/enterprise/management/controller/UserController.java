package com.es.enterprise.management.controller;

import com.es.enterprise.management.form.UserForm;
import com.es.enterprise.management.form.validator.UserFormValidator;
import com.es.enterprise.management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

/**
 * Created by fjmora on 17/06/16.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserFormValidator userFormValidator;


    @InitBinder("form")
    public void initBinder(WebDataBinder binder) {
        binder.addValidators(userFormValidator);
    }

    @RequestMapping("/user/{id}")
    public ModelAndView getUserPage(@PathVariable Long id) {
        return new ModelAndView("user", "user", userService.getUserById(id));
    }

    @RequestMapping(value = "/user/create", method = RequestMethod.GET)
    public ModelAndView getUserCreatePage() {
        return new ModelAndView("user_create", "form", new UserForm());
    }

    @RequestMapping(value = "/user/create", method = RequestMethod.POST)
    public String handleUserCreateForm(@Valid @ModelAttribute("form") UserForm form, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "user_create";
        }
        try {
            userService.create(form);
        } catch (DataIntegrityViolationException e) {
            bindingResult.reject("email.exists", "Email already exists");
            return "user_create";
        }
        return "redirect:/users";
    }

}
