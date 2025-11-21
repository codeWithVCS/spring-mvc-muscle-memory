package org.chandra.springmvc.topic4_validation.task4;

import jakarta.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @PostMapping("/api/v1/login")
    public String login(@Valid @RequestBody LoginForm form, BindingResult result){

        if(result.hasErrors()){
            StringBuilder sb = new StringBuilder("Errors: ");

            for (FieldError error : result.getFieldErrors()) {
                sb.append(error.getField())
                        .append(" ")
                        .append(error.getDefaultMessage())
                        .append(", ");
            }

            return sb.substring(0, sb.length() - 2);
        }

        return "Login OK: " + form.getUsername();
    }
}
