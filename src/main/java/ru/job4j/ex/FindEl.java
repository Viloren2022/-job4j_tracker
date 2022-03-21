package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = 0;
        for (int i = 0; i < value.length; i++) {
            if (String.valueOf(i).equals(key)) {
                rsl = i;
                break;
            } else if (i == value.length - 1) {
                throw new ElementNotFoundException();
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            String[] array = new String[8];
            System.out.println(indexOf(array, "15"));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
