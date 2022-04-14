package ru.job4j.tracker;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import ru.job4j.collection.ConvertList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ItemSortTest {
    @Test
    public void comparableSort() {
        List<Item> items = Arrays.asList(
                new Item(15, "Marats"),
                new Item(5, "Polina"),
                new Item(8, "Artemii")
        );
        Collections.sort(items);
        List<Item> expected = Arrays.asList(
                new Item(5, "Polina"),
                new Item(8, "Artemii"),
                new Item(15, "Marats")
        );
        assertThat(expected, is(items));
    }

    @Test
    public void itemAscByName() {
        List<Item> items = Arrays.asList(
                new Item(15, "Marat"),
                new Item(5, "Polina"),
                new Item(8, "Artemii")
        );
        items.sort(new ItemAscByName());
        List<Item> expected = Arrays.asList(
                new Item(8, "Artemii"),
                new Item(15, "Marat"),
                new Item(5, "Polina")
        );
        assertThat(expected, is(items));
    }

    @Test
    public void itemDescByName() {
        List<Item> items = Arrays.asList(
                new Item(15, "Marat"),
                new Item(5, "Polina"),
                new Item(8, "Artemii")
        );
        items.sort(new ItemDescByName());
        List<Item> expected = Arrays.asList(
                new Item(5, "Polina"),
                new Item(15, "Marat"),
                new Item(8, "Artemii")
        );
        assertThat(expected, is(items));
    }
}
