package org.chandra.springmvc.topic6_rest_json.task22;

public class XmlStatusResponse {

    private String status;
    private String message;

    public XmlStatusResponse() {}
    public XmlStatusResponse(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public String getStatus() {return status;}
    public void setStatus(String status) {this.status = status;}
    public String getMessage() {return message;}
    public void setMessage(String message) {this.message = message;}

}
