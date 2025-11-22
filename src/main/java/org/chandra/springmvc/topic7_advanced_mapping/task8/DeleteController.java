package org.chandra.springmvc.topic7_advanced_mapping.task8;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteController {

    @DeleteMapping("/api/v1/delete/{id}")
    public String delete(@PathVariable Integer id){
        return "Deleted resource with ID: " + id;
    }

}
