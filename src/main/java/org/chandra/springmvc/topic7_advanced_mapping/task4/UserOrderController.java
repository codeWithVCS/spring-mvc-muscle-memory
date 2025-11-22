package org.chandra.springmvc.topic7_advanced_mapping.task4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserOrderController {

    @GetMapping("/api/v1/user/{uid}/order/{oid}")
    public String getUserOrder(@PathVariable Integer uid, @PathVariable Integer oid){
        return "User: " + uid + ", Order: " + oid;
    }

}
