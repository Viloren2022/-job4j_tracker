package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Objects;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private static int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        if (index != -1) {
            item.setId(id);
            items[index] = item;
            return true;
        } else {
            return false;
        }

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

    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bag");
        tracker.add(bug);
        int id = bug.getId();
        System.out.println(tracker.replace(id, bug));
    }
}