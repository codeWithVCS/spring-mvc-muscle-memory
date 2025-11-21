package org.chandra.springmvc.topic4_validation.task7;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserProfileController {

    @PostMapping("/api/v1/user-profile")
    public String createUserProfile(@Validated@RequestBody UserProfileForm form,  BindingResult result) {
        if (result.hasErrors()) {
            StringBuffer sb = new StringBuffer("Errors: ");
            for(FieldError error : result.getFieldErrors()) {
                sb.append(error.getField())
                        .append(": ")
                        .append(error.getDefaultMessage())
                        .append(", ");
            }
            return sb.substring(0, sb.length() - 2);
        }

        return "UserProfile OK: " + form.getUsername() + ", " + form.getAge();
    }
}
