package org.chandra.springmvc.topic5_thymeleaf.task9;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InlineExpressionController {

    @GetMapping("/inline")
    public String getInlineExpression(Model model){
        model.addAttribute("city", "Hyderabad");
        return  "inline";
    }
}
