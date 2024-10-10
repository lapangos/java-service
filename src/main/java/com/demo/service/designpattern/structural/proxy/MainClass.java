package com.demo.service.designpattern.structural.proxy;

public class MainClass {
    public static void main(String[] args) {
        Service proxyService = new ProxyService();

        System.out.println(proxyService.fetchData("param1"));
        System.out.println(proxyService.fetchData("param1")); // This should fetch from cache
        System.out.println(proxyService.fetchData("param2"));
    }
}