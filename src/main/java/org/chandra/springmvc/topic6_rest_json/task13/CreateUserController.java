package org.chandra.springmvc.topic6_rest_json.task13;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateUserController {

    @PostMapping("/api/v1/users")
    public ResponseEntity<CreateUserResponse> createUser(){

        CreateUserResponse userResponse = new CreateUserResponse("USR-1001", "Chandra");

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(userResponse);

    }

}
