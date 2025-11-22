package org.chandra.springmvc.topic6_rest_json.task7;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductResponse {

    @JsonProperty("name")
    private String productName;
    @JsonProperty("cost")
    private double price;

    public ProductResponse() {}
    public ProductResponse(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {return this.productName;}
    public void setProductName(String productName) {this.productName = productName;}
    public double getPrice() {return this.price;}
    public void setPrice(double price) {this.price = price;}

}
