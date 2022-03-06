package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    Error() {
    }

    Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Статус ошибки " + active);
        System.out.println("Приоритет " + status);
        System.out.println("Устранить за " + message);
    }

    public static void main(String[] args) {
        Error fatal = new Error(true, 10, "за 30 минут");
        fatal.printInfo();
        Error critikal = new Error();
        critikal.printInfo();
        Error priority = new Error();
        priority.printInfo();

    }
}
