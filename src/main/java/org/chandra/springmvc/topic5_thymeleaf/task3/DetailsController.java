package org.chandra.springmvc.topic5_thymeleaf.task3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DetailsController {

    @GetMapping("/details")
    public String getDetails(Model model){
        model.addAttribute("title", "Product Details");
        model.addAttribute("productName", "Laptop");
        model.addAttribute("price", 45000);

        return "details";
    }
}
