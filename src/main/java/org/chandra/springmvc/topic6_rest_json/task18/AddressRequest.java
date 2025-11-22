package org.chandra.springmvc.topic6_rest_json.task18;

public class AddressRequest {

    private String city;
    private String country;

    public AddressRequest() {}
    public AddressRequest(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public String getCity() {return this.city;}
    public void setCity(String city) {this.city = city;}
    public String getCountry() {return this.country;}
    public void setCountry(String country) {this.country = country;}

}
