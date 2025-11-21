package org.chandra.springmvc.topic3_request_response.task18;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonResponseController {

    @GetMapping("/api/v1/status")
    public StatusResponse getStatus(){
        StatusResponse statusResponse = new StatusResponse("ok","service is running");
        return statusResponse;
    }
}
