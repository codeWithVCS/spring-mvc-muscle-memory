package org.chandra.springmvc.topic6_rest_json.task26;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ItemListController {

    @GetMapping(value = "/api/v1/items/mixed",
                produces = {"application/json", "application/xml"})
    public ResponseEntity<ItemListResponse> getMixed() {
        ItemResponse item1 = new ItemResponse("Keyboard", 500.0);
        ItemResponse item2 = new ItemResponse("Mouse", 300.0);
        List<ItemResponse> items = new ArrayList<>();
        items.addAll(List.of(item1, item2));
        ItemListResponse itemListResponse = new ItemListResponse("OK",items);
        return ResponseEntity.ok().body(itemListResponse);
    }

}
