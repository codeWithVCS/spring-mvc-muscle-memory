package org.chandra.springmvc.topic6_rest_json.task22;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class XmlStatusController {

    @GetMapping(produces = "application/xml", value = "/api/v1/status/xml")
    public ResponseEntity<XmlStatusResponse> getStatus() {
        return  ResponseEntity.ok(new XmlStatusResponse("OK", "XML response"));
    }
}
