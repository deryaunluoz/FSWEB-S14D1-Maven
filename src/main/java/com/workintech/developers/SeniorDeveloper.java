package com.workintech.developers;

public class SeniorDeveloper extends Employee {

    public SeniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("Senior developer starts to working and leading the team");
        setSalary(getSalary() + getSalary() * 0.15);
    }
}