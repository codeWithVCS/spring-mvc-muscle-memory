package org.chandra.springmvc.topic3_request_response.e1;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MiniCookieSetterController {

    @GetMapping("/api/v1/set-mode")
    public ResponseEntity<String> setModeCookie(){
        String cookieValue = "mode=dark; Path=/; HttpOnly";
        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.SET_COOKIE, cookieValue);
        return ResponseEntity.ok()
                .headers(headers)
                .body("mode cookie set");
    }
}
