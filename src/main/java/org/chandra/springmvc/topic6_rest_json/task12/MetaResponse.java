package org.chandra.springmvc.topic6_rest_json.task12;

public class MetaResponse {

    private String status;
    private String info;

    public MetaResponse() {}
    public MetaResponse(String status, String info) {
        this.status = status;
        this.info = info;
    }

    public String getStatus() {return status;}
    public void setStatus(String status) {this.status = status;}
    public String getInfo() {return info;}
    public void setInfo(String info) {this.info = info;}

}
