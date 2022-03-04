package ru.job4j.oop;

public class Cat {

    private String food;
    private String name;

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void show() {
        System.out.println("There are gav's food " + this.food);
        System.out.println("Cat's name is  " + this.name);
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.giveNick("Гав");
        gav.show();

        Cat black = new Cat();
        black.eat("fish");
        black.giveNick("Блэк");
        black.show();
    }
}
