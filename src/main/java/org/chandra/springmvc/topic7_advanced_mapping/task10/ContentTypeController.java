package org.chandra.springmvc.topic7_advanced_mapping.task10;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContentTypeController {

    @GetMapping(value = "/api/v1/data", produces = "application/json")
    public Response getJsonData(){
        return new Response("OK","JSON");
    }

    @GetMapping(value = "/api/v1/data", produces = "text/plain")
    public String getPlainTextData(){
        return "OK - PLAIN TEXT";
    }

}
