package com.example.designpartner.action.mediator;

public class Client {

    public static void main(String[] args) {
        Mediator leader = new Leader();
        Department market = new Market(leader);
        Department finacial = new Finacial(leader);
        Department development = new Development(leader);

        market.selfAction();
        leader.command("develop");
        leader.command("finacial");
    }
}
