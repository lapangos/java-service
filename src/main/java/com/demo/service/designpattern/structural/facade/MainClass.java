package com.demo.service.designpattern.structural.facade;

public class MainClass {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.start();
    }
}