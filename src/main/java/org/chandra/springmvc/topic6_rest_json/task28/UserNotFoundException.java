package org.chandra.springmvc.topic6_rest_json.task28;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
