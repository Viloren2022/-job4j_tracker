package ru.job4j.function;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class WithoutLambda {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangoroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        print(animals, e -> e.canHop);
        print(animals, a -> a.canSwim);
        //Comparator<String> cmpText = (left, right) -> left.compareTo(right);
        //Comparator<String> cmpDescSize = (left, right) -> Integer.compare(right.getName().length(), left.getName().length());
    }

        private static void print(List<Animal> animals, Predicate<Animal> checker) {
            for (Animal animal : animals) {
                if (checker.test(animal)) {
                    System.out.print(animal + " ");
                }
            }
            System.out.println();
    }
}
