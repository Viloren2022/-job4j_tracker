package ru.job4j.collection;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class JobDescByName implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
        return o2.getName().compareTo(o1.getName());
    }

    public static void main(String[] args) {
        List<Job> list = Arrays.asList(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        list.sort(new SortByNameJob());
        System.out.println(list);
    }
}


