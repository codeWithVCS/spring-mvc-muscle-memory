package org.chandra.springmvc.topic5_thymeleaf.task10;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VarTypesController {

    @GetMapping("/vartypes")
    public String getVarTypes(Model model){
        model.addAttribute("username", "Chandra");
        model.addAttribute("age", 28);
        model.addAttribute("isAdmin", true);
        return  "vartypes";
    }
}
