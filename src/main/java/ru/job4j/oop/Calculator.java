package ru.job4j.oop;

public class Calculator {

    private static int x = 12;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int a) {
        return x - a;
    }

    public int divide(int a) {
        return x / a;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int sumAllOperation(int a) {
       int rsl = sum(a) + multiply(a) + minus(a) + divide(a);
       return rsl;

    }

    public static void main(String[] args) {
        int result = sum(8);
        System.out.println(result);
        result = minus(3);
        System.out.println(result);
        Calculator calculator = new Calculator();
        result = calculator.divide(3);
        System.out.println(result);
        result = calculator.multiply(2);
        System.out.println(result);
        result = calculator.sumAllOperation(5);
        System.out.println(result);
    }
}