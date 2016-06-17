package com.es.enterprise.management.form.validator;


import com.es.enterprise.management.form.UserForm;
import com.es.enterprise.management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Created by fjmora on 17/06/16.
 */
@Component
public class UserFormValidator implements Validator {

    @Autowired
    private UserService userService;

    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.equals(UserForm.class);
    }

    @Override
    public void validate(Object target, Errors errors) {
        UserForm form = (UserForm) target;

    }

    private void validatePasswords(Errors errors, UserForm form) {
        if (userService.getUserByEmail(form.getEmail()) != null) {  // JAVA 8 con optional (isPresent()) TODO
            errors.reject("email.existis", "User with this email already exists.");
        }
    }
}
