package org.chandra.springmvc.topic3_request_response.e3;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MiniHttpEntityHeaderController {

    @GetMapping("/api/v1/get-client")
    public String getClientHeader(HttpEntity<String> httpEntity){
        HttpHeaders headers = httpEntity.getHeaders();
        String client = headers.getFirst("X-CLIENT");
        if(client == null){
            client = "none";
        }

        return "Client: " + client;
    }
}
