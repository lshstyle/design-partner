package com.example.designpartner.struct.composite;

public class TextFile implements AbstractFile{

    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("文本：" + name + " 查杀");
    }
}
