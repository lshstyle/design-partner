package com.example.designpartner.struct.composite;

public class Client {


    public static void main(String[] args) {
        Folder folder = new Folder("ζηζΆθ");
        AbstractFile image = new ImageFile("123.png");
        AbstractFile text = new TextFile("abc.txt");
        folder.add(image);
        folder.add(text);
        folder.killVirus();
    }

}
