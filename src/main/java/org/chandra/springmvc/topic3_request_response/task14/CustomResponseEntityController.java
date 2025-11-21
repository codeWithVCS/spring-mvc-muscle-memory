package org.chandra.springmvc.topic3_request_response.task14;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomResponseEntityController {

    @GetMapping("/api/v1/custom-response")
    public ResponseEntity<String> readCustomResponse(){

        HttpHeaders headers = new HttpHeaders();
        headers.add("X-APP-VERSION","1.0.0");
        headers.add("X-RESPONSE-TYPE", "custom");
        return ResponseEntity.status(HttpStatus.ACCEPTED)
                .headers(headers)
                .body("This is a custom response");
    }
}
