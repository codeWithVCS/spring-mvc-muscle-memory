package org.chandra.springmvc.topic5_thymeleaf.task2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessageController {

    @GetMapping("/message")
    public String getMessage(Model model){
        model.addAttribute("msg", "Spring MVC Thymeleaf Demo");
        return "message";
    }
}
