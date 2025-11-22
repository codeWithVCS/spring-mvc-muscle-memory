package org.chandra.springmvc.topic6_rest_json.task12;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MetaController {

    @GetMapping("/api/v1/meta")
    public ResponseEntity<MetaResponse> getMetaResponse() {

        MetaResponse metaResponse = new MetaResponse("OK", "Metadata response");

        return ResponseEntity.ok()
                .header("X-APP-VERSION", "1.0.0")
                .header("X-REQUEST-ID", "REQ-12345")
                .body(metaResponse);

    }

}
