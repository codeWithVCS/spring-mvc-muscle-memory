package org.chandra.springmvc.topic7_advanced_mapping.task3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    @GetMapping("/api/v1/item/{id}")
    public String getItem(@PathVariable Integer id){
        return "Item ID: " + id;
    }

}
