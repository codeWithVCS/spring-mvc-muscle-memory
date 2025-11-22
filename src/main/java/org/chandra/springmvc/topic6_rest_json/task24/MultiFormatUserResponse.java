package org.chandra.springmvc.topic6_rest_json.task24;

public class MultiFormatUserResponse {

    private String name;
    private int age;

    public MultiFormatUserResponse() {}
    public MultiFormatUserResponse(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

}
