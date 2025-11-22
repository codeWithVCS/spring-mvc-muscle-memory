package org.chandra.springmvc.topic6_rest_json.task7;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/api/v1/product")
    public ProductResponse getProductDetails(){

        ProductResponse productResponse = new ProductResponse("Laptop", 45000.0);

        return productResponse;

    }
}
