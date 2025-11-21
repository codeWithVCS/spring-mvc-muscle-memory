package org.chandra.springmvc.topic4_validation.task8;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @PostMapping("/api/v1/employee")
    public String createEmployee(@Validated @RequestBody EmployeeForm form, BindingResult result){
        if(result.hasErrors()){
            StringBuilder errors = new StringBuilder("Errors: ");
            for(FieldError error : result.getFieldErrors()){
                errors.append(error.getField())
                        .append(": ")
                        .append(error.getDefaultMessage())
                        .append(", ");
            }
            return  errors.substring(0, errors.length()-2);
        }

        return "Employee OK: " + form.getFullName() + ",  " + form.getDepartment() + ", " + form.getSalary();
    }
}
