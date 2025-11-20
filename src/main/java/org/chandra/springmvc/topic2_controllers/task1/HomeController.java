package org.chandra.springmvc.topic2_controllers.task1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/api/v1/greet")
    public String greet(){
        return "Hello, Spring MVC!";
    }
}
