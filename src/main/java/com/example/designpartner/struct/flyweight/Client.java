package com.example.designpartner.struct.flyweight;

public class Client {

    public static void main(String[] args) {
        Chess chess1 = ChessFactory.getChess("黑色");
        chess1.display(new Coordinate(1,2));
        Chess chess2 = ChessFactory.getChess("白色");
        chess2.display(new Coordinate(2,5));

    }
}
