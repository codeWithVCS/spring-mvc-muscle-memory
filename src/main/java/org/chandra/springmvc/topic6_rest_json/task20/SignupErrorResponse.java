package org.chandra.springmvc.topic6_rest_json.task20;

public class SignupErrorResponse {

    private String status;
    private String error;

    public SignupErrorResponse() {}
    public SignupErrorResponse(String status, String error) {
        this.status = status;
        this.error = error;
    }

    public String getStatus() {return status;}
    public void setStatus(String status) {this.status = status;}
    public String getError() {return error;}
    public void setError(String error) {this.error = error;}

}
