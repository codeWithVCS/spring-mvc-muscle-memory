package org.chandra.springmvc.topic2_controllers.task6;

import org.springframework.web.bind.annotation.*;

@RestController
public class ProductRoutingController {

    @GetMapping({"/api/v1/products", "/api/v1/products/"})
    public String getAllProducts(){
        return "Returning all products";
    }

    @GetMapping("/api/v1/products/{productId}")
    public String getProductById(@PathVariable Integer productId){
        return "Product ID:  "+productId;
    }

    @GetMapping("/api/v1/products/filter")
    public String filterProducts(@RequestParam(required = true) String category){
        return "Filtering products by category: " + category;
    }

    @GetMapping("/api/v1/products/{productId}/reviews")
    public String getReviewsForProduct(@PathVariable Integer productId,
                                       @RequestParam(required = false, defaultValue = "10") Integer limit){
        return "Product ID:  "+productId + ", Limit: " + limit;
    }

    @GetMapping({"/api/v1/products/status", "/api/v1/products/health"})
    public String checkStatus(){
        return "Product service is up";
    }

    @GetMapping(value = "/api/v1/products/premium", headers = "X-CLIENT-TYPE=premium")
    public String getPremiumProducts(){
        return "Premium client access verified";
    }

    @GetMapping("/api/v1/top-rated-products")
    public String getTopRatedProducts(){
        return "Top rated products";
    }

    @GetMapping("/api/v2/products")
    public String getProductsV2(){
        return "Products from API version 2";
    }

    @RequestMapping("/api/v1/products/**")
    public String fallback(){
        return "Fallback route for products";
    }

}
