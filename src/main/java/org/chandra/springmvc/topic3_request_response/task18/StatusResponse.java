package org.chandra.springmvc.topic3_request_response.task18;

public class StatusResponse {

    private String status;
    private String message;

    public StatusResponse() {}
    public StatusResponse(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public String getStatus() {return status;}
    public void setStatus(String status) {this.status = status;}
    public String getMessage() {return message;}
    public void setMessage(String message) {this.message = message;}

    @Override
    public String toString() {
        return "StatusResponse{" + "status=" + status + ", message=" + message + '}';
    }
}
