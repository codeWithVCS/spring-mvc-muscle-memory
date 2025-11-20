package org.chandra.springmvc.topic3_request_response.task1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicParamBindingController {

    @GetMapping("/api/v1/greet")
    public String greetUser(@RequestParam(required = true)String name,
                            @RequestParam(required = false, defaultValue = "unknown")String city){
        return "Hello "+ name + " from "+ city ;
    }
}
