package org.chandra.springmvc.topic2_controllers.task5;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlBestPracticesController {

    @GetMapping("/api/v1/items")
    public String getAllItems(){
        return "Returning all items";
    }

    @GetMapping("/api/v1/items/{itemId}")
    public String getItemById(@PathVariable Integer itemId){
        return "Item ID: " + itemId;
    }

    @GetMapping("/api/v1/items/{itemId}/reviews/{reviewId}")
    public String getReviewForItem(@PathVariable Integer itemId, @PathVariable Integer reviewId){
        return "Item ID: " + itemId + " Review ID: " + reviewId;
    }

    @GetMapping("/api/v1/top-selling-items")
    public String getTopSellingItems(){
        return "Top selling items";
    }

    @GetMapping("/api/v2/items")
    public String getItemsV2(){
        return "Items from API version 2";
    }
}
