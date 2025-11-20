package org.chandra.springmvc.topic2_controllers.taskS2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/catalog/products")
public class ProductCatalogController {

    @GetMapping({"","/"})
    public String listAllProducts(){
        return "All products listed";
    }

    @GetMapping("/{productId}")
    public String getProduct(@PathVariable(name = "productId") Integer productId){
        return "Product ID: " +  productId;
    }

    @GetMapping("/{productId}/variants")
    public String listProductVariants(@PathVariable(name = "productId") Integer productId){
        return "Variants of product: " +  productId;
    }

    @GetMapping("/filter")
    public String filterCatalog(@RequestParam(required = false, defaultValue = "all") String brand,
                                @RequestParam(required = false, defaultValue = "true") boolean available){
        return "Brand: " + brand + ", Available: " + available;
    }

    @GetMapping(value = "/restricted", headers = "X-CATALOG-KEY=valid")
    public String getRestrictedCatalogAccess(){
        return "Restricted catalog access granted";
    }

    @GetMapping({"/stats", "/metrics"})
    public String getCatalogStats(){
        return "Catalog statistics shown";
    }

    @RequestMapping("/**")
    public String fallback(){
        return "Catalog fallback";
    }
}
