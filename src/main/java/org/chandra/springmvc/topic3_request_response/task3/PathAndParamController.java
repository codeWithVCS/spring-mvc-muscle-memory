package org.chandra.springmvc.topic3_request_response.task3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathAndParamController {

    @GetMapping("/api/v1/orders/{orderId}/summary")
    public String getOrderSummary(@PathVariable Integer orderId,
                                  @RequestParam(required = false, defaultValue = "basic") String detail) {
        return "Order ID: " + orderId + ", Detail level:  " + detail;
    }
}
