package org.chandra.springmvc.topic6_rest_json.task31;

public class ErrorResponse {

    private String errorCode;
    private String message;
    private String path;

    public ErrorResponse() {}
    public ErrorResponse(String errorCode, String message, String path) {
        this.errorCode = errorCode;
        this.message = message;
        this.path = path;
    }

    public String getErrorCode() {return errorCode;}
    public void setErrorCode(String errorCode) {this.errorCode = errorCode;}
    public String getMessage() {return message;}
    public void setMessage(String message) {this.message = message;}
    public String getPath() {return path;}
    public void setPath(String path) {this.path = path;}

}
