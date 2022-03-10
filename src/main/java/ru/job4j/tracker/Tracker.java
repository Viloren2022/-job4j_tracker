package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private static int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findAll() {
        Item[] rsl = new Item[size];
        for (int index = 0; index < size; index++) {
            Item name = items[index];
            if (name != null) {
                rsl[index] = name;
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    public Item[] findByName(String key) {
        Item[] rsl2 = new Item[size];
        for (int index = 0; index < size; index++) {
            Item name = items[index];
            if (name.getName() == key) {
                rsl2[index] = name;
                size--;
            }
        }
        return Arrays.copyOf(rsl2, size);
    }
}