package org.chandra.springmvc.topic6_rest_json.task23;

public class XmlUserProfileResponse {

    private String name;
    private int age;
    private XmlAddressResponse address;

    public XmlUserProfileResponse() {}
    public XmlUserProfileResponse(String name, int age, XmlAddressResponse address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
    public XmlAddressResponse getAddress() {return address;}
    public void setAddress(XmlAddressResponse address) {this.address = address;}

}
