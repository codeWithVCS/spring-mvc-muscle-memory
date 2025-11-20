package org.chandra.springmvc.topic3_request_response.task9;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestHeaderController {

    @GetMapping("/api/v1/client-type")
    public String readClientType(@RequestHeader("X-CLIENT-TYPE") String clientType){
        return "Client type received: " + clientType;
    }
}
