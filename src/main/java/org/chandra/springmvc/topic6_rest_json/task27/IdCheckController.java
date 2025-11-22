package org.chandra.springmvc.topic6_rest_json.task27;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class IdCheckController {

    @ExceptionHandler(InvalidIdException.class)
    public ResponseEntity<Map<String, String>> handleInvalidIdException(InvalidIdException e) {

        Map<String,String> exceptionMap = new HashMap<>();
        exceptionMap.put("error", "INVALID_ID");
        exceptionMap.put("message", e.getMessage());

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exceptionMap);
    }

    @GetMapping("/api/v1/check/{id}")
    public String checkId(@PathVariable int id) {

        if(id <= 0){
            throw new InvalidIdException("ID must be greater than zero");
        }else{
            return "Valid ID: " + id;
        }

    }

}
