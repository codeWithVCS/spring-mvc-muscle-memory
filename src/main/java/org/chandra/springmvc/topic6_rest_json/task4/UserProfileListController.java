package org.chandra.springmvc.topic6_rest_json.task4;

import org.chandra.springmvc.topic6_rest_json.task3.AddressResponse;
import org.chandra.springmvc.topic6_rest_json.task3.UserProfileResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserProfileListController {

    @GetMapping("/api/v1/user/profiles")
    public List<UserProfileResponse> getUserProfiles() {
        List<UserProfileResponse> userProfiles = new ArrayList<>();
        UserProfileResponse profile1 = new UserProfileResponse("Chandra", 28, new AddressResponse("Hyderabad", "India"));
        UserProfileResponse profile2 = new UserProfileResponse("Arjun", 25, new AddressResponse("Bangalore", "India"));
        UserProfileResponse profile3 = new UserProfileResponse("Priya", 30, new AddressResponse("Chennai", "India"));

        userProfiles.addAll(List.of(profile1, profile2, profile3));

        return userProfiles;
    }
}
