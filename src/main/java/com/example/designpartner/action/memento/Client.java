package com.example.designpartner.action.memento;

public class Client {

    public static void main(String[] args) {

        CareTaker careTaker = new CareTaker();
        Emp emp = new Emp("第一代", 10, 90);
        System.out.println("第一次备忘");
        careTaker.setEmpMemento(emp.memento());
        System.out.println(emp.getEname() + "," + emp.getAge() + "," + emp.getSalary());
        emp.setEname("第二代");
        emp.setAge(20);
        emp.setSalary(199);
        System.out.println(emp.getEname() + "," + emp.getAge() + "," + emp.getSalary());
        emp.recovery(careTaker.getEmpMemento());
        System.out.println("回滚");
        System.out.println(emp.getEname() + "," + emp.getAge() + "," + emp.getSalary());
    }
}
