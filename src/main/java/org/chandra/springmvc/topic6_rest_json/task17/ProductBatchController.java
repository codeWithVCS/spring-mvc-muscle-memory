package org.chandra.springmvc.topic6_rest_json.task17;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductBatchController {

    @PostMapping("/api/v1/products/batch")
    public ResponseEntity<ProductBatchResponse> createBatch(@RequestBody List<ProductRequest> products) {
        int count = products.size();
        ProductBatchResponse response = new ProductBatchResponse(count, "RECEIVED");
        return ResponseEntity.ok().body(response);
    }

}
