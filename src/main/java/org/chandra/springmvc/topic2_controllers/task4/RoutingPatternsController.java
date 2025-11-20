package org.chandra.springmvc.topic2_controllers.task4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/routes")
public class RoutingPatternsController {

    @GetMapping({"", "/"})
    public String defaultRoute(){
        return "Default route reached";
    }

    @GetMapping({"/check", "/health"})
    public String statusCheck(){
        return "Status OK";
    }

    @RequestMapping("/**")
    public String fallback(){
        return "Fallback route hit";
    }
}
