package org.chandra.springmvc.topic6_rest_json.task19;

public class OrderRequest {

    private String product;
    private int quantity;

    public OrderRequest() {}
    public OrderRequest(String product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public String getProduct() {return product;}
    public void setProduct(String product) {this.product = product;}
    public int getQuantity() {return quantity;}
    public void setQuantity(int quantity) {this.quantity = quantity;}

}
