package com.workintech.developers;

public class JuniorDeveloper extends Employee {

    public JuniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("Junior developer starts to working and learning");
        setSalary(getSalary() + getSalary() * 0.05);
    }
}