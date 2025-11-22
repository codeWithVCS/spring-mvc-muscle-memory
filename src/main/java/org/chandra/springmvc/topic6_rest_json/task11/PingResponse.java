package org.chandra.springmvc.topic6_rest_json.task11;

public class PingResponse {

    private String status;
    private String message;

    public PingResponse() {}
    public PingResponse(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public String getStatus() {return status;}
    public void setStatus(String status) {this.status = status;}
    public String getMessage() {return message;}
    public void setMessage(String message) {this.message = message;}

}
