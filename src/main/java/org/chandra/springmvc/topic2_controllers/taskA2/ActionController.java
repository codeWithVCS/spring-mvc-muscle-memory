package org.chandra.springmvc.topic2_controllers.taskA2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/action")
public class ActionController {

    @GetMapping
    public String getAction(){
        return "GET request received";
    }

    @PostMapping
    public String createAction(){
        return "POST request received";
    }

    @PutMapping
    public String updateAction(){
        return "PUT request received";
    }

    @DeleteMapping
    public String deleteAction(){
        return "DELETE request received";
    }

    @GetMapping(value = "/special", headers = "X-ACCESS-LEVEL=super")
    public String specialAccess(){
        return "Special access granted";
    }

    @RequestMapping("/**")
    public String fallback(){
        return "Action fallback";
    }
}

