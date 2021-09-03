package com.example.designpartner.action.chainofreposibility;

public class Leader {

    private String name;
    private Integer days;
    private Leader next;

    public boolean audit(int days) {
        if (this.days > days) {
            System.out.println(name + "审批通过");
            return true;
        } else if (next != null) {
            return next.audit(days);
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Leader getNext() {
        return next;
    }

    public void setNext(Leader next) {
        this.next = next;
    }

    public Leader(String name, Integer days) {
        this.name = name;
        this.days = days;
    }
}
