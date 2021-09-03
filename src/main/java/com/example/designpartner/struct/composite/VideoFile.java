package com.example.designpartner.struct.composite;

public class VideoFile implements AbstractFile{

    private String name;

    public VideoFile(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("视频：" + name + " 查杀");
    }
}
