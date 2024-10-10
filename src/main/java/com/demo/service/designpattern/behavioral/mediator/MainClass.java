package com.demo.service.designpattern.behavioral.mediator;

public class MainClass {
    public static void main(String[] args) {
        Mediator mediator = new AuctionMediator();

        Participant buyer1 = new Buyer(mediator, "Buyer 1");
        Participant buyer2 = new Buyer(mediator, "Buyer 2");
        Participant seller = new Seller(mediator, "Seller");

        buyer1.placeBid(100);
        buyer2.placeBid(150);
        seller.placeBid(200);
    }
}