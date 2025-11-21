package org.chandra.springmvc.topic4_validation.task3;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class RegistrationForm {

    @NotBlank
    private String name;
    @Email
    @NotBlank
    private String email;

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
}
