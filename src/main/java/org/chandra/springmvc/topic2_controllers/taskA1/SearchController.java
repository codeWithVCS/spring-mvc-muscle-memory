package org.chandra.springmvc.topic2_controllers.taskA1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {

    @GetMapping("/api/v1/search/products")
    public String searchProducts(@RequestParam(required = true) String query,
                                 @RequestParam(required = false, defaultValue = "all") String category,
                                 @RequestParam(required = false, defaultValue = "relevance") String sort){
        return "Query: " + query + ", category: " + category + ", sort: " + sort;
    }

    @RequestMapping("/api/v1/search/**")
    public String fallback(){
        return "Search fallback";
    }
}
