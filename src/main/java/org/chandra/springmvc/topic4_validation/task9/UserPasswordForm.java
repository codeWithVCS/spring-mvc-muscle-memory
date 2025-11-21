package org.chandra.springmvc.topic4_validation.task9;

import jakarta.validation.constraints.NotBlank;
@PasswordMatches
public class UserPasswordForm {

    @NotBlank(message = "Password is required")
    private String password;
    @NotBlank(message = "Confirm Password is required")
    private String confirmPassword;

    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}
    public String getConfirmPassword() {return confirmPassword;}
    public void setConfirmPassword(String confirmPassword) {this.confirmPassword = confirmPassword;}
}
