package ru.job4j.oop;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " Выполняется междугородний рейс");
    }

    @Override
    public int fill(int fuel) {
        int countFuel = 0;
        countFuel += (fuel * 2);
        return countFuel;
    }
}