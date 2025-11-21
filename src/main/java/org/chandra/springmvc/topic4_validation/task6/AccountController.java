package org.chandra.springmvc.topic4_validation.task6;

import jakarta.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @PostMapping("/api/v1/account")
    public String createAccount(@Valid@RequestBody AccountForm form, BindingResult result){
        if(result.hasErrors()){
            StringBuilder errors = new StringBuilder("Errors: ");
            for (FieldError error : result.getFieldErrors()) {
                errors.append(error.getField())
                        .append(" ")
                        .append(error.getDefaultMessage())
                        .append(", ");
            }

            return errors.substring(0, errors.length()-2);
        }

        return "Account OK: " + form.getUsername() + ", " + form.getEmail();
    }
}
