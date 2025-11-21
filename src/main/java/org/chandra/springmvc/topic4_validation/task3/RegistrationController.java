package org.chandra.springmvc.topic4_validation.task3;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @PostMapping("/api/v1/register")
    public String registerUser(@Valid @RequestBody RegistrationForm form){
        return "Registered: " + form.getName() + ", " + form.getEmail();
    }
}
