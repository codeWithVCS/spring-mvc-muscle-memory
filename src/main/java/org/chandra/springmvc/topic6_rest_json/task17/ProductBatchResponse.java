package org.chandra.springmvc.topic6_rest_json.task17;

public class ProductBatchResponse {

    private int count;
    private String status;

    public ProductBatchResponse() {}
    public ProductBatchResponse(int count, String status) {
        this.count = count;
        this.status = status;
    }

    public int getCount() {return count;}
    public void setCount(int count) {this.count = count;}
    public String getStatus() {return status;}
    public void setStatus(String status) {this.status = status;}

}
