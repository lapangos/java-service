package com.demo.service.lld.elevator;

public class MainClass {
    public static void main(String[] args) {
        Elevator elevator = new Elevator(0);
        ElevatorController controller = new ElevatorController(elevator);
        RequestProcessor requestProcessor = new RequestProcessorImpl();

        Request request1 = new Request(5);
        Request request2 = new Request(2);

        requestProcessor.processRequest(request1, controller);
        requestProcessor.processRequest(request2, controller);
    }
}