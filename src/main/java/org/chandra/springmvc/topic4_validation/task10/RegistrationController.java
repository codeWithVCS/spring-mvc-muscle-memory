package org.chandra.springmvc.topic4_validation.task10;

import org.chandra.springmvc.topic4_validation.task10.RegistrationForm;
import org.chandra.springmvc.topic4_validation.task10.RegistrationFormValidator;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @InitBinder("registrationForm")
    public void initBinder(WebDataBinder binder) {
        binder.addValidators(new RegistrationFormValidator());
    }

    @PostMapping("/api/v1/register-final")
    public String register(@ModelAttribute("registrationForm") RegistrationForm registrationForm,
                           BindingResult result) {

        if (result.hasErrors()) {
            StringBuilder errors = new StringBuilder("Errors: ");

            for (FieldError error : result.getFieldErrors()) {
                errors.append(error.getField())
                        .append(": ")
                        .append(error.getDefaultMessage())
                        .append(", ");
            }

            return errors.substring(0, errors.length() - 2);
        }

        return "Registration OK: "
                + registrationForm.getUsername()
                + ", "
                + registrationForm.getEmail();
    }
}
