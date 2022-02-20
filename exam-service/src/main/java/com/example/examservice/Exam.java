package com.example.examservice;
public class Exam {
    private final int id;
    private final int studentId;
    private final String name;
    private final int marks;

    public Exam(final int id, final int studentId, final String name, final int marks) {
        this.id = id;
        this.studentId = studentId;
        this.name = name;
        this.marks=marks;
    }

    public int getId() {
        return id;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }
    public int getMarks() {
    	return marks;
    }
}