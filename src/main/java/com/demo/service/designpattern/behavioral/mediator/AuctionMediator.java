package com.demo.service.designpattern.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class AuctionMediator implements Mediator {
    private final List<Participant> participants = new ArrayList<>();
    private double highestBid = 0;
    private Participant highestBidder;

    @Override
    public void addParticipant(Participant participant) {
        participants.add(participant);
    }

    @Override
    public void placeBid(Participant participant, double bid) {
        if (bid > highestBid) {
            highestBid = bid;
            highestBidder = participant;
            notifyParticipants();
        }
    }

    private void notifyParticipants() {
        for (Participant participant : participants) {
            participant.update(highestBid, highestBidder);
        }
    }
}