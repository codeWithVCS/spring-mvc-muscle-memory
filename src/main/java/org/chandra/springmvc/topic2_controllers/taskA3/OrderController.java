package org.chandra.springmvc.topic2_controllers.taskA3;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {

    @GetMapping("/{orderId}/items/{itemId}")
    public String getOrderItem(@PathVariable String orderId, @PathVariable String itemId){
        return "order ID: " +  orderId + ", item ID: " + itemId;
    }

    @GetMapping()
    public String listOrders(@RequestParam(required = false, defaultValue = "all") String status,
                             @RequestParam(required = false, defaultValue = "date")String sort){
        return "Status: " + status + ", Sort: " + sort;
    }

    @RequestMapping("/**")
    public String routeInspector(){
        return "Orders wildcard route";
    }
}
