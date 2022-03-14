package ru.job4j.oop;

public class Plane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Выполняется международный рейс");
    }

    @Override
    public int fill(int fuel) {
        int countFuel = 0;
        countFuel += (fuel * 3);
        return countFuel;
    }
}
