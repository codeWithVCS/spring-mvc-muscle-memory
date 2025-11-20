package org.chandra.springmvc.topic3_request_response.task10;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class AllHeadersController {

    @GetMapping("/api/v1/headers")
    public String showAllHeader(@RequestHeader Map<String, String> headers){
        String userAgent = headers.getOrDefault("user-agent", "unknown");
        return "User-Agent received: " + userAgent;
    }
}
