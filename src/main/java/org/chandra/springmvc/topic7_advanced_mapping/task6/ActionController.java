package org.chandra.springmvc.topic7_advanced_mapping.task6;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActionController {

    @GetMapping("/api/v1/action")
    public String getAction(){
        return "GET request received";
    }

    @PostMapping("/api/v1/action")
    public String postAction(){
        return "POST request received";
    }

}
