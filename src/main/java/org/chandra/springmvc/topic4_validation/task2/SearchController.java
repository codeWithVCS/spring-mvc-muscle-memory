package org.chandra.springmvc.topic4_validation.task2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {

    @GetMapping("/api/v1/search-form")
    public String customSearch(@ModelAttribute SearchForm form){
        String keyword = form.getKeyword();
        String sortBy = form.getSortBy();

        if(keyword == null || keyword.isEmpty()){
            return "Invalid search";
        }

        return "Keyword: " + keyword + ", SortBy: " + sortBy;
    }
}
