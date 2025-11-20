package org.chandra.springmvc.topic3_request_response.task6;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomStatusController {

    @GetMapping("/api/v1/ping")
    public ResponseEntity<String> ping(){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("pong");
    }

}
