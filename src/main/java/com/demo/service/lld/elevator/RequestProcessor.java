package com.demo.service.lld.elevator;

public interface RequestProcessor {
    void processRequest(Request request, ElevatorController controller);
}