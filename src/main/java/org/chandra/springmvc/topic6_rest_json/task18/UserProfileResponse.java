package org.chandra.springmvc.topic6_rest_json.task18;

public class UserProfileResponse {

    private String status;
    private String user;

    public UserProfileResponse() {}
    public UserProfileResponse(String status, String user) {
        this.status = status;
        this.user = user;
    }

    public String getStatus() {return status;}
    public void setStatus(String status) {this.status = status;}
    public String getUser() {return user;}
    public void setUser(String user) {this.user = user;}

}
