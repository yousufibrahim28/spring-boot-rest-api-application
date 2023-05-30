package com.yousufibrahim28.springbootrestapiapplication;

public class Course {

    private int id;
    private String name;
    private String author;
    public Course(int id, String courseName, String author) {
        this.id = id;
        this.name = courseName;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }
}
