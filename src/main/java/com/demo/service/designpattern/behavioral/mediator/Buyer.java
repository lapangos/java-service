package com.demo.service.designpattern.behavioral.mediator;

public class Buyer extends Participant {
    public Buyer(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void update(double highestBid, Participant highestBidder) {
        System.out.println(name + " received update: Highest bid is now " + highestBid + " by " + highestBidder.getName());
    }

    @Override
    public void placeBid(double bid) {
        System.out.println(name + " is placing a bid of " + bid);
        mediator.placeBid(this, bid);
    }

}