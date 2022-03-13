package ru.job4j.tracker;

public interface Transport {
    String go();

    int countPassenger(int passenger);

    int fill(int fuel);

}
