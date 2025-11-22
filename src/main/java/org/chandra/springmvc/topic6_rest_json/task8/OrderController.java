package org.chandra.springmvc.topic6_rest_json.task8;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @GetMapping("/api/v1/order")
    public OrderResponse getOrder(){

        OrderResponse orderResponse = new OrderResponse("ORD-1001", "Laptop", null);

        return orderResponse;

    }

}
