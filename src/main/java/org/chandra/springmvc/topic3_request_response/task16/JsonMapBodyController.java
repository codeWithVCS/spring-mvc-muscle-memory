package org.chandra.springmvc.topic3_request_response.task16;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class JsonMapBodyController {

    @PostMapping("/api/v1/json-map")
    public String readJsonMap(@RequestBody Map<String, Object> json){

        String name =  (String) json.get("name");
        if(name == null){
            return "name not provided";
        }

        return "Hello "+name;
    }
}
