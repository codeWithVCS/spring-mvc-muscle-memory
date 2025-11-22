package org.chandra.springmvc.topic6_rest_json.task26;

public class ItemResponse {

    private String name;
    private double price;

    public ItemResponse() {}
    public ItemResponse(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public double getPrice() {return price;}
    public void setPrice(double price) {this.price = price;}

}
