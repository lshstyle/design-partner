package com.example.designpartner.struct.composite;

public class ImageFile implements AbstractFile{

    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("图片：" + name + " 查杀");
    }
}
