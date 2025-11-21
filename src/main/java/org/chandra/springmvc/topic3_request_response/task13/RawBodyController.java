package org.chandra.springmvc.topic3_request_response.task13;

import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RawBodyController {

    @PostMapping("/api/v1/raw-body")
    public String readRawBody(HttpEntity<String> httpEntity) {
        String body = httpEntity.getBody();
        if (body == null) {
            body = "empty";
        }

        return "Body received: "  + body;
    }
}
