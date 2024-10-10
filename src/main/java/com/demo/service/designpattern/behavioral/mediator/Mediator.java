package com.demo.service.designpattern.behavioral.mediator;

public interface Mediator {
    void addParticipant(Participant participant);
    void placeBid(Participant participant, double bid);
}