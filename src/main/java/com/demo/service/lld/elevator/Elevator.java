package com.demo.service.lld.elevator;

public class Elevator {
    private int currentFloor;
    private boolean movingUp;

    public Elevator(int initialFloor) {
        this.currentFloor = initialFloor;
        this.movingUp = true;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveUp() {
        currentFloor++;
    }

    public void moveDown() {
        currentFloor--;
    }

    public boolean isMovingUp() {
        return movingUp;
    }

    public void setMovingUp(boolean movingUp) {
        this.movingUp = movingUp;
    }
}