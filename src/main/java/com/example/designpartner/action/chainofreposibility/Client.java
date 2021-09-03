package com.example.designpartner.action.chainofreposibility;

public class Client {

    public static void main(String[] args) {
        Leader leader1 = new Leader("主管", 3);
        Leader leader2 = new Leader("经理", 10);
        leader1.setNext(leader2);
        leader1.audit(8);
    }
}
