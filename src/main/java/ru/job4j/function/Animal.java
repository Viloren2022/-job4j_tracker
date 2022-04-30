package ru.job4j.function;

public class Animal {
    private String species;
    boolean canHop;
    boolean canSwim;

    public Animal(String speciesName, boolean hopper, boolean swimmer) {
        this.species = speciesName;
        this.canHop = hopper;
        this.canSwim = swimmer;
    }

    public boolean canHop() {
        return canHop; }

    public boolean canSwim() {
        return canSwim; }

    public String toString() {
        return species; }
}
