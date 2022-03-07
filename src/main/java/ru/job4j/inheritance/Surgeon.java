package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private boolean hurt;

    public Surgeon(boolean hurt, int patientsCount) {
        super(patientsCount);
        this.hurt = hurt;
    }

    public void cutPatients() {
        String tmp = hurt ? "Let's cut off your leg!!!" : "You can go home";
        System.out.println(tmp);
    }
}
