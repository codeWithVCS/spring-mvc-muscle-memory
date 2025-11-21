package org.chandra.springmvc.topic4_validation.task1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FormBindingController {

    @GetMapping("/api/v1/user-form")
    public String getUserFormData(@ModelAttribute UserForm userForm) {
        if(userForm.getName() == null || userForm.getName().isEmpty()){
            return "Invalid Data";
        }
        return "User: " + userForm.getName() + ", Age: " + userForm.getAge();
    }
}
