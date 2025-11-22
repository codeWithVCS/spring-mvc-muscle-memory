package org.chandra.springmvc.topic6_rest_json.task23;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class XmlUserProfileController {

    @GetMapping(value = "/api/v1/xml/user-profile", produces = "application/xml")
    public ResponseEntity<XmlUserProfileResponse> getUserProfile() {
        XmlUserProfileResponse response = new XmlUserProfileResponse("Chandra", 28, new XmlAddressResponse("Hyderabad", "India"));

        return ResponseEntity.ok().body(response);
    }

}
