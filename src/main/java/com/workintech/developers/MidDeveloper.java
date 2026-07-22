package com.workintech.developers;

public class MidDeveloper extends Employee {

    public MidDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("Mid developer starts to working and mentoring");
        setSalary(getSalary() + getSalary() * 0.10);
    }
}