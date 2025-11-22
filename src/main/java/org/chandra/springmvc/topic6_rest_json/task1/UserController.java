package org.chandra.springmvc.topic6_rest_json.task1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/api/v1/user")
    public UserResponse getUserResponse(){

        UserResponse response = new UserResponse();
        response.setName("Chandra");
        response.setAge(28);

        return response;

    }

}
