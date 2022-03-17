package ru.job4j.tracker;

public interface UserAction {
    String name();

    boolean execute(Output output, Input input, Tracker tracker);
}