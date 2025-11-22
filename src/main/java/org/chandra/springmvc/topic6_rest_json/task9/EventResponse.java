package org.chandra.springmvc.topic6_rest_json.task9;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class EventResponse {

    private String title;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime eventTime;

    public EventResponse(){}
    public EventResponse(String title, LocalDateTime eventTime) {
        this.title = title;
        this.eventTime = eventTime;
    }

    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}
    public LocalDateTime getEventTime() {return eventTime;}
    public void setEventTime(LocalDateTime eventTime) {this.eventTime = eventTime;}

}
