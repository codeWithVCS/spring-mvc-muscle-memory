package org.chandra.springmvc.topic3_request_response.task5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExplicitResponseBodyController {

    @GetMapping("/api/v1/hello")
    @ResponseBody
    public String sayHello(){
        return "Hello from @ResponseBody";
    }
}
