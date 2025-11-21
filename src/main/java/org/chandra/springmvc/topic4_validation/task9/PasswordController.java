package org.chandra.springmvc.topic4_validation.task9;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PasswordController {

    @PostMapping("/api/v1/password-check")
    public String passwordCheck(@Validated @RequestBody UserPasswordForm form, BindingResult result) {

        if (result.hasErrors()) {
            StringBuilder sb = new StringBuilder("Errors: ");

            // FIELD ERRORS
            for (FieldError error : result.getFieldErrors()) {
                sb.append(error.getField())
                        .append(": ")
                        .append(error.getDefaultMessage())
                        .append(", ");
            }

            // OBJECT-LEVEL ERRORS (from @PasswordMatches)
            for (ObjectError error : result.getGlobalErrors()) {
                sb.append("UserPasswordForm")     // name of the object
                        .append(": ")
                        .append(error.getDefaultMessage())
                        .append(", ");
            }

            return sb.substring(0, sb.length() - 2);
        }

        return "Password OK";
    }
}
