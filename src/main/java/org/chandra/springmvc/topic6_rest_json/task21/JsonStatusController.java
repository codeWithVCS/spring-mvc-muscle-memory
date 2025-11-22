package org.chandra.springmvc.topic6_rest_json.task21;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonStatusController {

    @GetMapping(value = "/api/v1/status/json", produces = "application/json")
    public ResponseEntity<StatusResponse> getStatus(){
        return ResponseEntity
                .ok()
                .body(new StatusResponse("OK", "JSON response"));
    }

}
