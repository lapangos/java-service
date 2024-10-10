package com.demo.service.designpattern.structural.facade;

public class Memory {
    public void load(long position, byte[] data) {
        System.out.println("Loading data into memory at position " + position);
    }
}