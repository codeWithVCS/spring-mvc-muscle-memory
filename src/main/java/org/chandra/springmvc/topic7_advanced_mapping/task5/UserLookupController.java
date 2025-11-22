package org.chandra.springmvc.topic7_advanced_mapping.task5;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserLookupController {

    @GetMapping("/api/v1/users")
    public String getUsers(){
        return "All Users";
    }

    @GetMapping("/api/v1/users/{id}")
    public String getUser(@PathVariable Integer id){
        return "User ID: " + id;
    }

}
