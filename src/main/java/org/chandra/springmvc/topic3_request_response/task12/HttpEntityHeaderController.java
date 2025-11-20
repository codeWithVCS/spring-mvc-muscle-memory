package org.chandra.springmvc.topic3_request_response.task12;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HttpEntityHeaderController {

    @GetMapping("/api/v1/http-headers")
    public String readHeaders(HttpEntity<String> httpEntity) {
        HttpHeaders headers = httpEntity.getHeaders();
        String requestId = headers.getFirst("X-REQUEST-ID");
        if(requestId == null){
            requestId = "none";
        }

        return "Request Id: " + requestId;
    }

}
