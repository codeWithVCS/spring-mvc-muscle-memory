package org.chandra.springmvc.topic5_thymeleaf.task12;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AttrController {

    @GetMapping("/attr")
    public String attr(Model model){
        model.addAttribute("elementId", "user-section");
        model.addAttribute("cssClass", "highlight");
        return "attr";
    }
}
