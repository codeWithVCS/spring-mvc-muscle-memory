package org.chandra.springmvc.topic6_rest_json.task3;

public class UserProfileResponse {

    private String name;
    private int age;
    private AddressResponse address;

    public UserProfileResponse() {}
    public UserProfileResponse(String name, int age, AddressResponse address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
    public AddressResponse getAddress() {return address;}
    public void setAddress(AddressResponse address) {this.address = address;}

}
