package org.chandra.springmvc.topic4_validation.task7;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidUsernameValidator implements ConstraintValidator<ValidUsername,String> {

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if(s == null || s.isEmpty()){
            return false;
        }
        boolean valid = s.matches(".*\\d.*");

        return valid;
    }
}
