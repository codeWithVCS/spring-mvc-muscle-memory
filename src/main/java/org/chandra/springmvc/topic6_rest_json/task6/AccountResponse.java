package org.chandra.springmvc.topic6_rest_json.task6;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class AccountResponse {

    private String username;
    private String email;
    @JsonIgnore
    private String password;

    public AccountResponse() {}
    public AccountResponse(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {return username;}
    public void setUsername(String username) {this.username = username;}
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}

}
