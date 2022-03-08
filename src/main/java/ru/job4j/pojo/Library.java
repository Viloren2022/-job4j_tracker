package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean code", 432);
        Book book2 = new Book("Mein Kampf mit Java", 321);
        Book book3 = new Book("Harry Potter and tears polymorphism", 244);
        Book book4 = new Book("The book junhle", 217);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getCountPage());
        }
        Book[] booksTmp = new Book[1];
        booksTmp[0] = books[0];
        books[0] = books[3];
        books[3] = booksTmp[0];
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + " - " + bk.getCountPage());
        }
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            if (books[i].equals(book1)) {
                System.out.println(bk.getName());
            }
        }
    }
}
