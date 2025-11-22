package org.chandra.springmvc.topic6_rest_json.task5;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DynamicJsonController {

    @GetMapping("/api/v1/dynamic-info")
    public Map<String, Object> getDynamicInfo() {
        Map<String, Object> map = new HashMap<>();
        map.put("status", "OK");
        map.put("timestamp", System.currentTimeMillis());

        Map<String, Object> user = new HashMap<>();
        user.put("name", "Chandra");
        user.put("role", "admin");

        map.put("user", user);

        return map;
    }

}
