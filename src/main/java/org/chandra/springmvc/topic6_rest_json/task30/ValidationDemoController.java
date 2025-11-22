package org.chandra.springmvc.topic6_rest_json.task30;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidationDemoController {

    @PostMapping("/api/v1/validate/user")
    public String validateUser(@Valid @RequestBody UserForm form) {
        return "User OK: " + form.getName() + ", age " + form.getAge();
    }
}
