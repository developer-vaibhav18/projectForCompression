package com.example.apis;

import com.example.beans.mongo.MongoRepairOrder;
import com.example.services.RoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ro")
public class ROApi {

    @Autowired
    private RoService roService;

    @PostMapping("/create")
    public void addRo(@RequestBody MongoRepairOrder repairOrder) {
        roService.addRo(repairOrder);
    }

    @GetMapping("/{id}")
    public MongoRepairOrder getRo(@PathVariable String id) throws Exception {
        return roService.getRo(id);
    }
}
