package org.chandra.springmvc.topic5_thymeleaf.task7;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExpressionController {

    @GetMapping("/expr")
    public String getExpression(Model model){
        model.addAttribute("username", "Chandra");
        return "expr";
    }
}
