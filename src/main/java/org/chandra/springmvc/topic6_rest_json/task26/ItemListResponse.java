package org.chandra.springmvc.topic6_rest_json.task26;

import java.util.List;

public class ItemListResponse {

    private String status;
    private List<ItemResponse> items;

    public ItemListResponse() {}
    public  ItemListResponse(String status, List<ItemResponse> items) {
        this.status = status;
        this.items = items;
    }

    public String getStatus() {return status;}
    public void setStatus(String status) {this.status = status;}
    public List<ItemResponse> getItems() {return items;}
    public void setItems(List<ItemResponse> items) {this.items = items;}

}
