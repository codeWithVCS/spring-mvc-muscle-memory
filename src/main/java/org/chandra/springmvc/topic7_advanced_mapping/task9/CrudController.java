package org.chandra.springmvc.topic7_advanced_mapping.task9;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/crud")
public class CrudController {

    @GetMapping("/{id}")
    public String readResource(@PathVariable Integer id){
        return "Read resource with ID: " + id;
    }

    @PostMapping("/{id}")
    public String createResource(@PathVariable Integer id){
        return "Created resource with ID: " + id;
    }

    @PutMapping("/{id}")
    public String updateResource(@PathVariable Integer id){
        return "Updated resource with ID: " + id;
    }

    @DeleteMapping("/{id}")
    public String deleteResource(@PathVariable Integer id){
        return "Deleted resource with ID: " + id;
    }

}
