package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Marat Garifullin");
        student.setGroup("97");
        student.setStart(new Date());
        System.out.println(student.getName() + " : " + student.getGroup() + " : " + student.getStart());
    }
}
