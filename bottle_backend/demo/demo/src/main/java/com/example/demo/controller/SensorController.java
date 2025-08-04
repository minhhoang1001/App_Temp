package com.example.demo.controller;

import com.example.demo.service.SensorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/sensor")
public class SensorController {

    private final SensorService sensorService;

    public SensorController(SensorService sensorService) {
        this.sensorService = sensorService;
    }

//    // ---------- Amount ----------
//    @PostMapping("/amount")
//    public ResponseEntity<String> receiveAmountData(@RequestBody Map<String, Object> payload) {
//        sensorService.saveAmountData(payload);
//        return ResponseEntity.ok("Amount data received successfully! " + payload);
//    }
//
//    @GetMapping("/amount")
//    public ResponseEntity<Map<String, Object>> getLatestAmountData() {
//        return sensorService.getLatestAmountData()
//                .map(ResponseEntity::ok)
//                .orElseGet(() -> ResponseEntity.noContent().build());
//    }

    // ---------- Temperature ----------
    @PostMapping("/temperature")
    public ResponseEntity<String> receiveTemperatureData(@RequestBody Map<String, Object> payload) {
        sensorService.saveTemperatureData(payload);
        return ResponseEntity.ok("Temperature data received successfully! " + payload);
    }

    @GetMapping("/temperature")
    public ResponseEntity<Map<String, Object>> getLatestTemperatureData() {
        return sensorService.getLatestTemperatureData()
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.noContent().build());
    }
}
