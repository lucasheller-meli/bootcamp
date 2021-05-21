package com.manha.school;

public class Student {
    private String name;
    private int age;
    private int registration;
    private int year;

    public Student(String name, int age, int registration, int year) {
        this.name = name;
        this.age = age;
        this.registration = registration;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRegistration() {
        return registration;
    }

    public void setRegistration(int registration) {
        this.registration = registration;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", registration=" + registration +
                ", year=" + year +
                '}';
    }
}
