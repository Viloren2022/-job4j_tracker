package ru.job4j.oop;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " Выполняется городской маршрут");
    }

    @Override
    public int fill(int fuel) {
        int countFuel = 0;
        countFuel += fuel;
        return countFuel;
    }
}
