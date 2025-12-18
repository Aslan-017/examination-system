package com.examination;

public class Exam {
    private int id;
    private String name;
    private int duration;

    public Exam(int id, String name, int duration) {
        this.id = id;
        this.name = name;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void display() {
        System.out.println("Exam: " + name + ", ID: " + id + ", Duration: " + duration + " minutes");
    }
}