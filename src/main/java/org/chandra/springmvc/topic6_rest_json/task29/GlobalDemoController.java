package org.chandra.springmvc.topic6_rest_json.task29;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GlobalDemoController {

    @GetMapping("/api/v1/demo/input/{value}")
    public String getInput(@PathVariable String value){
        if(value.equals("bad")){
            throw new InvalidInputException("Invalid input provided");
        }
        else{
            return "Input OK: " + value;
        }
    }

    @GetMapping("/api/v1/demo/resource/{name}")
    public String getResource(@PathVariable String name){
        if(name.equals("none")){
            throw new ResourceNotFoundException("Resource not found");
        }
        else{
            return "Resource OK: " + name;
        }
    }

}
