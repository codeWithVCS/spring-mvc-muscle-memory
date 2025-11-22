package org.chandra.springmvc.topic6_rest_json.task20;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignupController {

    @PostMapping("/api/v1/signup")
    public ResponseEntity<Object> signup(@RequestBody SignupRequest signupRequest) {
        String name = signupRequest.getUsername();
        String email = signupRequest.getEmail();
        String password = signupRequest.getPassword();

        if(name == null || name.isEmpty()){
            return ResponseEntity.ok().body(new SignupErrorResponse("FAIL", "username is required"));
        }

        if(email == null || email.isEmpty()){
            return ResponseEntity.ok().body(new SignupErrorResponse("FAIL", "email is required"));
        }

        if(password == null || password.isEmpty()){
            return ResponseEntity.ok().body(new SignupErrorResponse("FAIL", "password is required"));
        }

        return ResponseEntity.ok().body(new SignupSuccessResponse("OK","Signup completed for " + name));
    }

}
