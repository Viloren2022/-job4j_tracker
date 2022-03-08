package ru.job4j.inheritance;

public class Doctor extends Profession {
    private int patientsCount;

    public Doctor(int patientsCount, String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
        this.patientsCount = patientsCount;
    }

    public void examinationPatients() {
        System.out.println("Checked " + patientsCount + " patients");
    }
}
