package org.chandra.springmvc.topic4_validation.task9;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, UserPasswordForm> {

    @Override
    public boolean isValid(UserPasswordForm form, ConstraintValidatorContext constraintValidatorContext) {

        String password = form.getPassword();
        String confirmPassword = form.getConfirmPassword();

        if(password == null || confirmPassword == null || password.isEmpty() || confirmPassword.isEmpty()){
            return false;
        }
        return password.equals(confirmPassword);
    }
}
