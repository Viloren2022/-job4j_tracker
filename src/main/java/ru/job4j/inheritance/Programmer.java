package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String level;

    public Programmer(String level, boolean project, String name, String surname, String education, String birthday) {
        super(project, name, surname, education, birthday);
        this.level = level;
    }

    public void hack() {
        System.out.println("My coding level is " + level);
    }
}
