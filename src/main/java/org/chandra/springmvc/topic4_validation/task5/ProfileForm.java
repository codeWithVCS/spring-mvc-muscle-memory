package org.chandra.springmvc.topic4_validation.task5;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class ProfileForm {

    @NotBlank(message = "First name is required")
    private String firstName;
    @Min(value = 18, message = "Age must be at least 18")
    private int age;

    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

}
