package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private boolean fillup;

    public Dentist(boolean fillup, int patientsCount) {
        super(patientsCount);
        this.fillup = fillup;
    }

    public void fill() {
        String tmp = fillup ? "need to pay 500$" : "you are lucky";
    }

}
