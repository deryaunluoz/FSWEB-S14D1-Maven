package com.workintech.developers;

public class HRManager extends Employee {

    private static final int CAPACITY = 10;

    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
        this.juniorDevelopers = new JuniorDeveloper[CAPACITY];
        this.midDevelopers = new MidDeveloper[CAPACITY];
        this.seniorDevelopers = new SeniorDeveloper[CAPACITY];
    }

    @Override
    public void work() {
        System.out.println("HR manager starts to working and managing the team");
        setSalary(getSalary() + getSalary() * 0.20);
    }

    public void addEmployee(JuniorDeveloper junior, int index) {
        if (!isIndexValid(index, juniorDevelopers.length)) {
            System.out.println("Warning: index " + index + " does not exist in juniorDevelopers array");
            return;
        }
        if (juniorDevelopers[index] != null) {
            System.out.println("Warning: index " + index + " is already occupied in juniorDevelopers array, data was not overwritten");
            return;
        }
        juniorDevelopers[index] = junior;
    }

    public void addEmployee(MidDeveloper mid, int index) {
        if (!isIndexValid(index, midDevelopers.length)) {
            System.out.println("Warning: index " + index + " does not exist in midDevelopers array");
            return;
        }
        if (midDevelopers[index] != null) {
            System.out.println("Warning: index " + index + " is already occupied in midDevelopers array, data was not overwritten");
            return;
        }
        midDevelopers[index] = mid;
    }

    public void addEmployee(SeniorDeveloper senior, int index) {
        if (!isIndexValid(index, seniorDevelopers.length)) {
            System.out.println("Warning: index " + index + " does not exist in seniorDevelopers array");
            return;
        }
        if (seniorDevelopers[index] != null) {
            System.out.println("Warning: index " + index + " is already occupied in seniorDevelopers array, data was not overwritten");
            return;
        }
        seniorDevelopers[index] = senior;
    }

    private boolean isIndexValid(int index, int arrayLength) {
        return index >= 0 && index < arrayLength;
    }

    public JuniorDeveloper[] getJuniorDevelopers() {
        return juniorDevelopers;
    }

    public MidDeveloper[] getMidDevelopers() {
        return midDevelopers;
    }

    public SeniorDeveloper[] getSeniorDevelopers() {
        return seniorDevelopers;
    }
}