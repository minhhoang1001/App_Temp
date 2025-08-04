package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class SensorService {

    // Lưu amount data
    private final List<Map<String, Object>> amountDataList = new ArrayList<>();
    // Lưu temperature data
    private final List<Map<String, Object>> temperatureDataList = new ArrayList<>();

    public void saveAmountData(Map<String, Object> data) {
        amountDataList.add(data);
    }

    public Optional<Map<String, Object>> getLatestAmountData() {
        if (amountDataList.isEmpty()) return Optional.empty();
        return Optional.of(amountDataList.get(amountDataList.size() - 1));
    }

    public void saveTemperatureData(Map<String, Object> data) {
        temperatureDataList.add(data);
    }

    public Optional<Map<String, Object>> getLatestTemperatureData() {
        if (temperatureDataList.isEmpty()) return Optional.empty();
        return Optional.of(temperatureDataList.get(temperatureDataList.size() - 1));
    }
}
