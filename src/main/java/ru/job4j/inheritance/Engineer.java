package ru.job4j.inheritance;

public class Engineer extends Profession {
    private boolean project;

    public Engineer(boolean project, String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
        this.project = project;
    }

    public void doProject() {
        String tmp = project ? "Project ready" : "deadline passed";
        System.out.println(tmp);
    }
}
