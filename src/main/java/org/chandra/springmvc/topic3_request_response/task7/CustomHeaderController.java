package org.chandra.springmvc.topic3_request_response.task7;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomHeaderController {

    @GetMapping("/api/v1/server-info")
    public ResponseEntity<String> getServerInfo() {

        HttpHeaders headers = new HttpHeaders();
        headers.add("X-SERVER-NAME", "spring-mvc-demo");
        headers.add("X-ENV", "development");

        return ResponseEntity
                .ok()
                .headers(headers)
                .body("Server info delivered");
    }
}
