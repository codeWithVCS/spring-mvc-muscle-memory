package org.chandra.springmvc.topic6_rest_json.task25;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "User")
public class CustomXmlUserResponse {

    @JacksonXmlProperty(localName = "FullName")
    private String name;
    @JacksonXmlProperty(localName = "YearsOld")
    private int age;

    public CustomXmlUserResponse() {}
    public CustomXmlUserResponse(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

}
