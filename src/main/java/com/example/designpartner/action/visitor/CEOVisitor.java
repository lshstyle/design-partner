package com.example.designpartner.action.visitor;

public class CEOVisitor implements  Visitor {

    @Override
    public void visitor(Engineer engineer) {
        System.out.println("ceo查看：" + engineer.getName() + ",kpi:" + engineer.getKpi() +", " +engineer.getProcess());
    }

    @Override
    public void visitor(Manager manager) {
        System.out.println("ceo查看：" + manager.getName() + ",kpi:" + manager.getKpi() +", " +manager.getProducts());
    }
}
