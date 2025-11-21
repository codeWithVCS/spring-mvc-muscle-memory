package org.chandra.springmvc.topic5_thymeleaf.task8;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConcatController {

    @GetMapping("/concat")
    public String getConcatString(Model model){
        model.addAttribute("firstName", "Chandra");
        return "concat";
    }
}
