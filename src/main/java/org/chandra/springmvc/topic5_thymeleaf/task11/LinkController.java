package org.chandra.springmvc.topic5_thymeleaf.task11;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LinkController {
    @GetMapping("/linkdemo")
    public String getLinkDemo(Model model){
        model.addAttribute("userId", 101);
        return  "linkdemo";
    }
}
