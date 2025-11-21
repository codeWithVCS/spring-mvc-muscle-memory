package org.chandra.springmvc.topic3_request_response.task17;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonDtoBodyController {

    @PostMapping("/api/v1/user")
    public String processUser(@RequestBody UserRequest userRequest){
        String name = userRequest.getName();
        int age = userRequest.getAge();

        if(name==null || name.isEmpty()){
            return "Invalid user data";
        }

        return "User: " + name + ", Age : " + age;
    }
}
