package org.chandra.springmvc.topic3_request_response.task15;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlainTextBodyController {

    @PostMapping("/api/v1/echo")
    public String echoText(@RequestBody String body) {

        if(body == null || body.isEmpty()){
            return "No content recived";
        }

        return "Received: " + body;
    }
}
