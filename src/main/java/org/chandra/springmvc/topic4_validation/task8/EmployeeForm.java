package org.chandra.springmvc.topic4_validation.task8;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import org.chandra.springmvc.topic4_validation.task7.ValidUsername;

public class EmployeeForm {

    @NotBlank(message = "Full name is required")
    private String fullName;
    @ValidUsername
    private String department;
    @Min(value = 10000, message = "Salary must be >= 10000")
    private int salary;

    public String getFullName() {return fullName;}
    public void setFullName(String fullName) {this.fullName = fullName;}
    public String getDepartment() {return department;}
    public void setDepartment(String department) {this.department = department;}
    public int getSalary() {return salary;}
    public void setSalary(int salary) {this.salary = salary;}
}
