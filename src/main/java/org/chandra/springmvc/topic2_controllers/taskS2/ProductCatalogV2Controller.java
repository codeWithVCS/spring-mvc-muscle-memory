package org.chandra.springmvc.topic2_controllers.taskS2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2/catalog/products")
public class ProductCatalogV2Controller {

    @GetMapping()
    public String listProductsV2(){
        return "Catalog v2 products returned";
    }

}
