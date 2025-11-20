package org.chandra.springmvc.topic3_request_response.task2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MultiParamBindingController {

    @GetMapping("/api/v1/product/describe")
    public String describeProduct(@RequestParam(required = true) String name,
                                  @RequestParam(required = true) String category,
                                  @RequestParam(required = false, defaultValue = "not-rated")String rating){
        return "Product: " + name + ", Category: " + category + ", Rating: " + rating;
    }
}
