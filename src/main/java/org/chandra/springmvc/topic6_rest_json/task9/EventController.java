package org.chandra.springmvc.topic6_rest_json.task9;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class EventController {

    @GetMapping("/api/v1/event")
    public EventResponse getEvent(){

        EventResponse conference = new EventResponse("Conference", LocalDateTime.now());

        return conference;

    }
}
