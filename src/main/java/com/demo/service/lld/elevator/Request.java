package com.demo.service.lld.elevator;

public class Request {
    private final int targetFloor;

    public Request(int targetFloor) {
        this.targetFloor = targetFloor;
    }

    public int getTargetFloor() {
        return targetFloor;
    }
}