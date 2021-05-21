package com.manha.school;

import java.util.List;

public class School {
    public static void main(String[] args) {
        Subject subject1 = new Subject("Matemática Básica", 80);
        Subject subject2 = new Subject("Java", 160);
        Subject subject3 = new Subject("POO", 100);

        Student student1 = new Student("Heller", 21, 1010, 9);
        Student student2 = new Student("Mari", 25, 1011, 9);
        Student student3 = new Student("Thami", 24, 1012, 8);
        Student student4 = new Student("Gabriel", 22, 1013, 8);

        Classroom classroom1 = new Classroom(9, "A", List.of(subject1, subject2), List.of(student1, student2));
        Classroom classroom2 = new Classroom(8, "B", List.of(subject2, subject3), List.of(student3, student4));

        System.out.println(classroom1);
        System.out.println(classroom2);
    }
}
