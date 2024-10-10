package com.demo.service.designpattern.behavioral.mediator;

public abstract class Participant {
    protected Mediator mediator;
    protected String name;

    public Participant(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
        this.mediator.addParticipant(this);
    }

    public String getName() {
        return name;
    }

    public abstract void update(double highestBid, Participant highestBidder);
    public abstract void placeBid(double bid);
}