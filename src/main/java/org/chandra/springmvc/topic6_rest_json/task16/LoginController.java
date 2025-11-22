package org.chandra.springmvc.topic6_rest_json.task16;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @PostMapping("/api/v1/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest) {

        if(loginRequest.getUsername() == null || loginRequest.getUsername().isEmpty()){
            return ResponseEntity
                    .ok()
                    .body(new LoginResponse("FAIL", "unknown"));
        }
        else{
            return ResponseEntity
                    .ok()
                    .body(new LoginResponse("OK", loginRequest.getUsername()));
        }

    }

}
