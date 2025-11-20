package org.chandra.springmvc.topic3_request_response.task11;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CookieReaderController {

    @GetMapping("/api/v1/read-cookie")
    public String readUserCookie(@CookieValue(value = "user-id", required = false, defaultValue = "none")String user_id){
        return "Cookie user-id: " + user_id;
    }
}
