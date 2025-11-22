package org.chandra.springmvc.topic6_rest_json.task15;

public class ErrorResponse {

    private String errorCode;
    private String message;

    public ErrorResponse() {}
    public ErrorResponse(String errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
    }

    public String getErrorCode() {return errorCode;}
    public void setErrorCode(String errorCode) {this.errorCode = errorCode;}
    public String getMessage() {return message;}
    public void setMessage(String message) {this.message = message;}

}
