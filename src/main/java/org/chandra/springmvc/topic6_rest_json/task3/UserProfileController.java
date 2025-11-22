package org.chandra.springmvc.topic6_rest_json.task3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserProfileController {

    @GetMapping("/api/v1/user/profile")
    public UserProfileResponse getUserProfile() {

        AddressResponse addressResponse = new AddressResponse("Hyderabad", "India");
        UserProfileResponse userProfileResponse = new UserProfileResponse("Chandra", 28, addressResponse);

        return userProfileResponse;

    }

}
