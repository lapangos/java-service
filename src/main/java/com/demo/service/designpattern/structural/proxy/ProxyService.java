package com.demo.service.designpattern.structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class ProxyService implements Service {
    private RealService realService;
    private Map<String, String> cache;

    public ProxyService() {
        this.realService = new RealService();
        this.cache = new HashMap<>();
    }

    @Override
    public String fetchData(String parameter) {
        if (cache.containsKey(parameter)) {
            return cache.get(parameter) + " (from cache)";
        } else {
            String data = realService.fetchData(parameter);
            cache.put(parameter, data);
            return data + " (from real service)";
        }
    }
}