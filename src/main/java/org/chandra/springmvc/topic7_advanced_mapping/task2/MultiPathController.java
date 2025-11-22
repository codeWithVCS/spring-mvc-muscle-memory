package org.chandra.springmvc.topic7_advanced_mapping.task2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MultiPathController {

    @GetMapping({"/api/v1/a", "/api/v1/b"})
    public String getPath(){
        return "Multi-path handler invoked";
    }

}
