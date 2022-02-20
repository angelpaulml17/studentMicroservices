package com.example.studentservice;
public class Student {
    private final int id;
    private final String name;

    public Student(final int id,  final String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}