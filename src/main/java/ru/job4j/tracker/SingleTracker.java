package ru.job4j.tracker;

import java.util.List;

public final class SingleTracker {
    private Tracker tracker = new Tracker();
    private static SingleTracker checkCopy = null;

    private SingleTracker() {
    }

    public static SingleTracker getCheckCopy() {
        if (checkCopy == null) {
            checkCopy = new SingleTracker();
        }
        return checkCopy;
    }

    public Item add(Item item) {
        return tracker.add(item);
    }

    public List<Item> findAll() {
        return tracker.findAll();
    }

    public Item findById(int id) {
        return tracker.findById(id);
    }

    public List<Item> findByName(String key) {
        return tracker.findByName(key);
    }

    public boolean replace(int id, Item item) {
        return tracker.replace(id, item);

    }

    public boolean delete(int id) {
        return tracker.delete(id);
    }
}