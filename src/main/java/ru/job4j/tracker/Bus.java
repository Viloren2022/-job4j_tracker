package ru.job4j.tracker;

public class Bus implements Transport {

    @Override
    public String go() {
        System.out.println("Вжжжжх!");
        return null;
    }

    @Override
    public int countPassenger(int passenger) {
        int count = 0;
        count += passenger;
        return 0;
    }

    @Override
    public int fill(int fuel) {
        int fuelPrice = 2;
        return fuelPrice * fuel;
    }
}
