package org.chandra.springmvc.topic6_rest_json.task8;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderResponse {

    private String orderId;
    private String item;
    private String notes;

    public OrderResponse() {}
    public OrderResponse(String orderId, String item, String notes) {
        this.orderId = orderId;
        this.item = item;
        this.notes = notes;
    }

    public String getOrderId() {return this.orderId;}
    public void setOrderId(String orderId) {this.orderId = orderId;}
    public String getItem() {return this.item;}
    public void setItem(String item) {this.item = item;}
    public String getNotes() {return this.notes;}
    public void setNotes(String notes) {this.notes = notes;}

}
