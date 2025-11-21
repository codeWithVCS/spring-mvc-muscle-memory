package org.chandra.springmvc.topic4_validation.task6;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class AccountForm {

    @NotBlank(message = "Username is required")
    private String username;
    @Size(min = 6, message = "Password must be at leats 6 characters")
    private String password;
    @Email(message = "Invalid email format")
    private String email;

    public String getUsername() {return username;}
    public void setUsername(String username) {this.username = username;}
    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

}
