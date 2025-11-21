package org.chandra.springmvc.topic4_validation.task7;

import jakarta.validation.constraints.Min;

public class UserProfileForm {

    @ValidUsername
    private String username;
    @Min(value = 18, message = "Age must be >= 18")
    private int age;

    public String getUsername() {return username;}
    public void setUsername(String username) {this.username = username;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
}
