package org.chandra.springmvc.topic6_rest_json.task6;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/api/v1/account")
    public AccountResponse getAccountDetails(){

        AccountResponse accountResponse = new AccountResponse("Chandra", "chandra@exampl.com", "supersecret");

        return accountResponse;
    }

}
