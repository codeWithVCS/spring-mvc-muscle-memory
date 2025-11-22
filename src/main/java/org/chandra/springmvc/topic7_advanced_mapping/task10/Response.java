package org.chandra.springmvc.topic7_advanced_mapping.task10;

public class Response {

    private String status;
    private String format;

    public Response(){}
    public Response(String status, String format){
        this.status = status;
        this.format = format;
    }

    public String getStatus() {return status;}
    public void setStatus(String status) {this.status = status;}
    public String getFormat() {return format;}
    public void setFormat(String format) {this.format = format;}

}
