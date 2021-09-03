package com.example.designpartner.action.mediator;

import java.util.HashMap;
import java.util.Map;

public class Leader  implements  Mediator {

    private Map<String , Department> map = new HashMap<String ,Department>();

    @Override
    public void register(String name, Department department) {
        map.put(name, department);
    }

    @Override
    public void command(String name) {
        map.get(name).outAction();
    }
}
