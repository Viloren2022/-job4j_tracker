package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] leftsplit = left.split(". ");
        String[] rightsplit = right.split(". ");
        int leftstr = Integer.parseInt(leftsplit[0]);
        int rightstr = Integer.parseInt(rightsplit[0]);
        return Integer.compare(leftstr, rightstr);
    }
}
