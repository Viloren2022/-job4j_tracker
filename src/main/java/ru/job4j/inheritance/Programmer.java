package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String level;

    public Programmer(String level, boolean project) {
        super(project);
        this.level = level;
    }

    public void hack() {
        System.out.println("My coding level is " + level);
    }
}
