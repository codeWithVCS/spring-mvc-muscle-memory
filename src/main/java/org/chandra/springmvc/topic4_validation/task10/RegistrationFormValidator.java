package org.chandra.springmvc.topic4_validation.task10;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class RegistrationFormValidator implements Validator {

    @Override
    public void validate(Object target, Errors errors) {
        errors.rejectValue("username", null, "username is required");
        errors.rejectValue("email", null, "invalid email");
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return clazz ==  RegistrationForm.class;
    }

}
