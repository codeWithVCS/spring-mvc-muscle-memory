package org.chandra.springmvc.topic3_request_response.task4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderItemDetailController {

    @GetMapping("/api/v1/orders/{orderId}/items/{itemId}")
    public String getOrderItemDetail(@PathVariable Integer orderId,
                                     @PathVariable Integer itemId,
                                     @RequestParam(required = false, defaultValue = "simple") String format) {
        return "Order ID: " + orderId + ", Item ID: " + itemId + " Format: " + format;
    }
}
