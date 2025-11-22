package org.chandra.springmvc.topic6_rest_json.task15;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ValidationController {

    @GetMapping("/api/v1/validate")
    public ResponseEntity<Object> validate(@RequestParam String value){

        ErrorResponse errorResponse = new ErrorResponse("INVALID_INPUT", "Value parameter is required");
        Map<String, String> validResponse = new HashMap<>();
        validResponse.put("status", "VALID");

        if(value==null || value.isEmpty()){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
        }
        else{

            return ResponseEntity.ok().body(validResponse);
        }
    }
}
