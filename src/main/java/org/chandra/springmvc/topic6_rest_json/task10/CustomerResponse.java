package org.chandra.springmvc.topic6_rest_json.task10;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"password", "internalCode"})
public class CustomerResponse {

    private String id;
    private String name;
    private String email;
    private String password;
    private String internalCode;

    public CustomerResponse() {}
    public CustomerResponse(String id, String name, String email, String password, String internalCode) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.internalCode = internalCode;
    }

    public String getId() {return id;}
    public void setId(String id) {this.id = id;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}
    public String getInternalCode() {return internalCode;}
    public void setInternalCode(String internalCode) {this.internalCode = internalCode;}

}
