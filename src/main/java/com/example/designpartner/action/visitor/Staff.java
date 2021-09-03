package com.example.designpartner.action.visitor;

public abstract class Staff {
    private String name;
    private double kpi;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getKpi() {
        return kpi;
    }

    public void setKpi(double kpi) {
        this.kpi = kpi;
    }

    public Staff(String name) {
        this.name = name;
    }

    public abstract void visitor(Visitor visitor);
}
