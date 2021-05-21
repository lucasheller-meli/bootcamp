package com.entities;

import java.util.List;

public class Classroom {
    private int year;
    private String code;
    private List<Subject> subjects;
    private List<Student> students;

    public Classroom(int year, String code, List<Subject> subjects, List<Student> students) {
        this.year = year;
        this.code = code;
        this.subjects = subjects;
        this.students = students;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "year=" + year +
                ", code='" + code + '\'' +
                ", subjects=" + subjects +
                ", students=" + students +
                '}';
    }
}
