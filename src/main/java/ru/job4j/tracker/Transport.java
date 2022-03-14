package ru.job4j.tracker;

public interface Transport {
    void go();

    void countPassenger(int passenger);

    int fill(int fuel);

}
