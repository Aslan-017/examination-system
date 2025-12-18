package com.examination;

public class Question {
    private int id;
    private String text;
    private int points;

    public Question(int id, String text, int points) {
        this.id = id;
        this.text = text;
        this.points = points;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public int getPoints() {
        return points;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void display() {
        System.out.println("Question " + id + ": " + text + " (" + points + " points)");
    }
}