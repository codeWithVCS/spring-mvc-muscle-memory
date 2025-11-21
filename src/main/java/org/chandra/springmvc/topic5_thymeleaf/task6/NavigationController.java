package org.chandra.springmvc.topic5_thymeleaf.task6;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavigationController {

    @GetMapping("/page1")
    public String getPage1(Model model) {
        model.addAttribute("pageName", "Page One");
        return "page1";
    }

    @GetMapping("/page2")
    public String getPage2(Model model) {
        model.addAttribute("pageName", "Page Two");
        return "page2";
    }
}
