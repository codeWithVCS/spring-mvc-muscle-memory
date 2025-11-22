package org.chandra.springmvc.topic6_rest_json.task2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserListController {

    @GetMapping("/api/v1/users")
    public List<UserResponse> getUserList(){

        List<UserResponse> userResponseList = new ArrayList<>();

        userResponseList.add(new UserResponse("Chandra",28));
        userResponseList.add(new UserResponse("Arjun", 25));
        userResponseList.add(new UserResponse("Priya", 30));

        return userResponseList;
    }

}
