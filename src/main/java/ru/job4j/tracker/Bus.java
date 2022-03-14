package ru.job4j.tracker;

public class Bus implements Transport {

    @Override
    public void go() {
        boolean wheels = true;
    }

    @Override
    public void countPassenger(int passenger) {
        int count = 0;
        count += passenger;
    }

    @Override
    public int fill(int fuel) {
        int fuelPrice = 2;
        return fuelPrice * fuel;
    }
}
