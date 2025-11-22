package org.chandra.springmvc.topic6_rest_json.task24;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserFormatController {

    @GetMapping(value = "/api/v1/user/format", produces = {"application/json", "application/xml"})
    public ResponseEntity<MultiFormatUserResponse> getUserFormat() {
        return ResponseEntity.ok(new MultiFormatUserResponse("Chandra", 28));
    }

}
