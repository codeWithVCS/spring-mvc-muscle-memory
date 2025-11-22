package org.chandra.springmvc.topic7_advanced_mapping.task7;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpdateController {

    @PutMapping("/api/v1/update/{id}")
    public String update(@PathVariable Integer id){
        return "Updated resource with ID: " + id;
    }

}
