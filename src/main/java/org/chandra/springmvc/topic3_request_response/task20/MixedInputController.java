package org.chandra.springmvc.topic3_request_response.task20;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MixedInputController {

    @PostMapping("/api/v1/product/process")
    public String processProduct(@RequestBody ProductRequest productRequest,
                                 @RequestParam(required = true) String source){
        if(productRequest.getName() == null || productRequest.getName().isEmpty()){
            return "invalid product data";
        }
        return "Source: " + source + ", Product: " + productRequest.getName() + ", Price: " + productRequest.getPrice();
    }
}
