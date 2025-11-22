package org.chandra.springmvc.topic6_rest_json.task19;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderProcessController {

    @PostMapping("/api/v1/order/process")
    public ResponseEntity<OrderResponse> createOrder(@RequestBody OrderRequest orderRequest, @RequestParam String source) {

        if(orderRequest.getProduct()==null || orderRequest.getProduct().isEmpty()){
            return ResponseEntity
                    .ok()
                    .body(new OrderResponse("FAIL", "Invalid Product"));
        }

        return ResponseEntity
                .ok()
                .body(new OrderResponse("OK", "Order for " + orderRequest.getProduct() + " from " + source + " received."));

    }

}
