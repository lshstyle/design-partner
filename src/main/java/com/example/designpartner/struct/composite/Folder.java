package com.example.designpartner.struct.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements AbstractFile{

    private String name;
    private List<AbstractFile> list = new ArrayList<AbstractFile>();

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("文件夹：" + name + " 查杀");
        for (AbstractFile file : list) {
            file.killVirus();
        }
    }


    public void add(AbstractFile file) {
        list.add(file);
    }


}
