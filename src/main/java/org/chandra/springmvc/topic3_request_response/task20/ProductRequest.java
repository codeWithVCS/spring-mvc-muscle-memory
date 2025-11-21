package org.chandra.springmvc.topic3_request_response.task20;

public class ProductRequest {

    private String name;
    private double price;

    public ProductRequest() {}
    public ProductRequest(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public double getPrice() {return price;}
    public void setPrice(double price) {this.price = price;}

    @Override
    public String toString() {
        return "ProductRequest{" + "name=" + name + ", price=" + price + '}';
    }
}
