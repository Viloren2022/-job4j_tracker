package ru.job4j.inheritance;

public class Builder extends Engineer {
    private int countBuilding;

    public Builder(int countBuilding, boolean project) {
        super(project);
        this.countBuilding = countBuilding;
    }

    public void build() {
        System.out.println("He built " + countBuilding + " houses");
    }
}
