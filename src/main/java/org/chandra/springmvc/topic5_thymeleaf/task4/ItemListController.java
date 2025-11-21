package org.chandra.springmvc.topic5_thymeleaf.task4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ItemListController {

    @GetMapping("/items")
    public String getItems(Model model){

        List<String> items = List.of("keyboard", "Mouse", "Monitor");
        model.addAttribute("items", items);

        return "items";
    }
}
