package com.example.designpartner.action.memento;

public class Emp {

    private String ename;
    private int age;
    private double salary;

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Emp(String ename, int age, double salary) {
        this.ename = ename;
        this.age = age;
        this.salary = salary;
    }

    public void recovery(EmpMemento e) {
        this.ename = e.getEname();
        this.age = e.getAge();
        this.salary = e.getSalary();
    }

    public EmpMemento memento() {
        return new EmpMemento(this);
    }

}
