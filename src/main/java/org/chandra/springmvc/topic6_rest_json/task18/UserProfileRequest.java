package org.chandra.springmvc.topic6_rest_json.task18;

public class UserProfileRequest {

    private String name;
    private int age;
    private AddressRequest address;

    public UserProfileRequest() {}
    public UserProfileRequest(String name, int age, AddressRequest address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
    public AddressRequest getAddress() {return address;}
    public void setAddress(AddressRequest address) {this.address = address;}

}
