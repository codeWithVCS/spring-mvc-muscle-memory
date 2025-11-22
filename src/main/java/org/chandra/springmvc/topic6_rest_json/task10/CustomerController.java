package org.chandra.springmvc.topic6_rest_json.task10;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @GetMapping("/api/v1/customer")
    public CustomerResponse getCustomerResponse(){

        CustomerResponse customerResponse = new CustomerResponse("CUST-101", "Chandra", "chandra@example.com", "secretpass", "XYZ-999");

        return customerResponse;

    }

}
