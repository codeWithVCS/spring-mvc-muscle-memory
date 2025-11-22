package org.chandra.springmvc.topic6_rest_json.task31;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorDemoController {

    @GetMapping("/api/v1/error/illegal")
    public void getIllegal(){
        throw new IllegalArgumentException("Illegal argument used");
    }

    @GetMapping("/api/v1/error/state")
    public void getState(){
        throw new IllegalStateException("Invalid state detected");
    }

}
