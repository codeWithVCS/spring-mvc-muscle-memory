package org.chandra.springmvc.topic3_request_response.task8;

import jakarta.servlet.http.Cookie;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CookieController {

    @GetMapping("/api/v1/set-cookie")
    public ResponseEntity<String> setUserCookie(){
        Cookie cookie = new Cookie("user-id", "12345");
        cookie.setPath("/");
        cookie.setHttpOnly(true);
        HttpHeaders headers = new HttpHeaders();
        String cookieValue = cookie.getName() + "=" + cookie.getValue() + "; Path= " + cookie.getPath() + "; HttpOnly=" + cookie.isHttpOnly();
        headers.add(HttpHeaders.SET_COOKIE, cookieValue);
       return ResponseEntity.ok().headers(headers).body("Cookie set successfully");
    }
}
