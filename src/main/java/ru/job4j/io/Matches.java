package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    private static String matchesEnd(int matches) {
        return switch (matches) {
            case 4, 3, 2 -> " спички";
            case 1 -> " cпичка";
            default -> " спичек";
        };
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3: ");
            int matches = Integer.parseInt(input.nextLine());
            if (matches >= 1 && matches <= 3) {
                turn = !turn;
                count -= matches;
                System.out.println("На столе осталось " + count + matchesEnd(count));
            } else {
                System.out.println("Вы ввели некоректное значение. Попробуйте еще раз!");
            }
        }
        System.out.println("Игра завершена");
        String winplayer = !turn ? "Выиграл первый игрок" : "Выиграл второй игрок";
        System.out.println(winplayer);
    }
}