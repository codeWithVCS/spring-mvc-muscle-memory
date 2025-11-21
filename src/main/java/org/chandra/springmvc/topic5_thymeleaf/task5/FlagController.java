package org.chandra.springmvc.topic5_thymeleaf.task5;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FlagController {

    @GetMapping("/flag")
    public String getFlag(Model model){
        model.addAttribute("isPremiumUser", true);
        return "flag";
    }
}
