package ru.job4j.ex;

public class FindEl extends ElementNotFoundException {
    public FindEl(String message) {
        super(message);
    }

    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (String.valueOf(i).equals(key)) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("\"Element Not Found\"");
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            String[] array = new String[8];
            indexOf(array, "15");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
