package com.demo.service.lld.elevator;

public class RequestProcessorImpl implements RequestProcessor {
    @Override
    public void processRequest(Request request, ElevatorController controller) {
        controller.addRequest(request);
        controller.processRequests();
    }
}