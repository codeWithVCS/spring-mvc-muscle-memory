package org.chandra.springmvc.topic2_controllers.task3;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/items")
public class ItemQueryController {

    @GetMapping("/{id}/details")
    public String getItemDetails(@PathVariable Integer id,
                                 @RequestParam(required = false, defaultValue = "none") String filter){
        return "Item ID: " + id + ", Filter: " + filter;
    }
}
