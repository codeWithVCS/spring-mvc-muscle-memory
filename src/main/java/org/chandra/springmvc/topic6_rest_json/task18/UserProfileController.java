package org.chandra.springmvc.topic6_rest_json.task18;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserProfileController {

    @PostMapping("/api/v1/user/profile")
    public ResponseEntity<UserProfileResponse> createProfile(@RequestBody UserProfileRequest userProfileRequest){

        if(userProfileRequest.getName() == null || userProfileRequest.getName().isEmpty()){
            return ResponseEntity.badRequest().body(new UserProfileResponse("FAIL", "unknown"));
        }

        return ResponseEntity.ok().body(new UserProfileResponse("OK", userProfileRequest.getName() + " from " + userProfileRequest.getAddress().getCity()));

    }

}
