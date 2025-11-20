package org.chandra.springmvc.topic2_controllers.task2;

import org.springframework.web.bind.annotation.*;

@RestController
public class AdvancedMappingController {

    @GetMapping("/api/v1/items/{id}")
    public String getById(@PathVariable Integer id){
        return "Received ID: " + id;
    }

    @PostMapping("/api/v1/items")
    public String createItem(){
        return "Item Created successfully";
    }

    @GetMapping("/api/v1/items/filter")
    public String filterByCategory(@RequestParam String category){
        return "Filtering items by category: " + category;
    }

    @GetMapping(value = "/api/v1/items/special",headers = "X-SPECIAL-CLIENT=true")
    public String getSpecialData(){
        return "Special client access granted";
    }
}
