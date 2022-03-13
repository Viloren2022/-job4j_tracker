package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    @SuppressWarnings("checkstyle:MissingSwitchDefault")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            if (1 <= matches && matches <= 3 && matches <= count) {
                turn = !turn;
                count = count - matches;
                String endSpichka;
                if (count > 4 || count == 0) {
                    endSpichka = " спичек.";
                } else if (count > 1) {
                    endSpichka = " спички.";
                } else {
                    endSpichka = " спичка.";
                }
                System.out.println("На столе осталось " + (count) + endSpichka);
            } else {
                System.out.println("Вы ввели некоректное значение. Попробуйте еще раз!");
            }
        }
        System.out.println("Игра завершена");
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}