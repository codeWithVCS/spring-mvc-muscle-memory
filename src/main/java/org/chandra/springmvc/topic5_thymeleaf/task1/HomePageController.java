package org.chandra.springmvc.topic5_thymeleaf.task1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.View;

@Controller
public class HomePageController {

    @GetMapping("/home")
    public String homePage(Model model) {
        return "home";
    }
}
