package org.chandra.springmvc.topic6_rest_json.task11;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

    @GetMapping("/api/v1/ping")
    public ResponseEntity<PingResponse> getPingResponse() {

        PingResponse pingResponse = new PingResponse("ACCEPTED", "Request received");

        return ResponseEntity.status(202).body(pingResponse);

    }

}
