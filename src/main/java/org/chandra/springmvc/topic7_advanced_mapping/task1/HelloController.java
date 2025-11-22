package org.chandra.springmvc.topic7_advanced_mapping.task1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/v1/hello")
    public String hello(){
        return "Hello from Spring MVC!";
    }

}
