package org.chandra.springmvc.topic6_rest_json.task29;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
