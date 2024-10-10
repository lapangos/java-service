package com.demo.service.designpattern.structural.bridge;

public class MainClass {
    public static void main(String[] args) {
        Device radio = new Radio();
        RemoteControl basicRemote = new BasicRemote(radio);

        basicRemote.togglePower();
        basicRemote.volumeUp();
        System.out.println("Radio volume: " + radio.getVolume());

        Device tv = new TV();
        AdvancedRemote advancedRemote = new AdvancedRemote(tv);

        advancedRemote.togglePower();
        advancedRemote.mute();
        System.out.println("TV volume: " + tv.getVolume());
    }
}