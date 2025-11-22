package org.chandra.springmvc.topic6_rest_json.task25;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomXmlUserController {

    @GetMapping(value = "/api/v1/xml/user/custom",produces = "application/xml")
    public ResponseEntity<CustomXmlUserResponse> getCustomXmlUser() {
        return ResponseEntity.ok(new CustomXmlUserResponse("Chandra", 28));
    }
}
