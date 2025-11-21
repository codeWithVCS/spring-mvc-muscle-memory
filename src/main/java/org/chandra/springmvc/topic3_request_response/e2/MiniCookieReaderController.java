package org.chandra.springmvc.topic3_request_response.e2;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MiniCookieReaderController {

    @GetMapping("/api/v1/get-mode")
    public String getMode(@CookieValue(value = "mode", required = false, defaultValue = "none")String mode){
        return "mode cookie: " +  mode;
    }
}
