package com.demo.service.lld.elevator;

import java.util.LinkedList;
import java.util.Queue;

public class ElevatorController {
    private final Elevator elevator;
    private final Queue<Request> requestQueue;

    public ElevatorController(Elevator elevator) {
        this.elevator = elevator;
        this.requestQueue = new LinkedList<>();
    }

    public void addRequest(Request request) {
        requestQueue.add(request);
    }

    public void processRequests() {
        while (!requestQueue.isEmpty()) {
            Request request = requestQueue.poll();
            int targetFloor = request.getTargetFloor();
            while (elevator.getCurrentFloor() != targetFloor) {
                if (elevator.getCurrentFloor() < targetFloor) {
                    elevator.moveUp();
                } else {
                    elevator.moveDown();
                }
                System.out.println("Elevator at floor: " + elevator.getCurrentFloor());
            }
            System.out.println("Elevator reached target floor: " + targetFloor);
        }
    }
}