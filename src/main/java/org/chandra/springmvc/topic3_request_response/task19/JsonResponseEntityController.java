package org.chandra.springmvc.topic3_request_response.task19;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonResponseEntityController {

    @GetMapping("/api/v1/api-response")
    public ResponseEntity<ApiResponse> getApiResponse(){

        ApiResponse apiResponse = new ApiResponse("SUCCESS","Operation completed");

        HttpHeaders headers = new HttpHeaders();
        headers.add("X-API-VERSION", "2.0");
        headers.add("X-RESULT", "success");

        return ResponseEntity.status(HttpStatus.CREATED)
                .headers(headers)
                .body(apiResponse);
    }
}
