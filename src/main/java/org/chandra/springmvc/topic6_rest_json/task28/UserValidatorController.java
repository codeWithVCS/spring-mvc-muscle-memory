package org.chandra.springmvc.topic6_rest_json.task28;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserValidatorController {

    @ExceptionHandler(InvalidAgeException.class)
    public ResponseEntity<Map<String, String>> handleInvalidAgeException(InvalidAgeException ex) {

        Map<String,String> map = new HashMap<>();
        map.put("error", "INVALID_AGE");
        map.put("message", ex.getMessage());

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(map);
    }

    @ExceptionHandler(UserNotFoundException.class)
    public  ResponseEntity<Map<String, String>> handleUserNotFoundException(UserNotFoundException ex) {

        Map<String,String> map = new HashMap<>();
        map.put("error", "USER_NOT_FOUND");
        map.put("message", ex.getMessage());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
    }

    @GetMapping("/api/v1/user/validate/{age}")
    public String validateUser(@PathVariable("age") Integer age){

        if(age<0){
            throw  new InvalidAgeException("Age cannot be negative");
        }

        if(age<18){
            throw new UserNotFoundException("User is below valid age threshold");
        }

        return "Valid Age: " + age;
    }

}
