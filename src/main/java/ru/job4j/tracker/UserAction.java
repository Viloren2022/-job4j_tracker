package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public interface UserAction {
    String name();

    boolean execute(Input input, Tracker tracker);
}