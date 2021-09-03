package com.example.designpartner.struct.flyweight;

public class CorcreteChess implements  Chess {

    private String color;

    public CorcreteChess(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return this.getColor();
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void display(Coordinate coordinate) {
        System.out.println("颜色：" + color + " X:" + coordinate.getX() + " Y: " + coordinate.getY());
    }
}
