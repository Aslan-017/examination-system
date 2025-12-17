package com.examination;

import java.util.ArrayList;
import java.util.List;

public class Exam {
    private int examId;
    private String examName;
    private int duration; // in minutes
    private int passingScore;
    private List<Question> questions;

    // Default constructor
    public Exam() {
        this.examId = 0;
        this.examName = "";
        this.duration = 60;
        this.passingScore = 50;
        this.questions = new ArrayList<>();
    }

    // Constructor with parameters
    public Exam(int examId, String examName, int duration, int passingScore) {
        this.examId = examId;
        this.examName = examName;
        this.duration = duration;
        this.passingScore = passingScore;
        this.questions = new ArrayList<>();
    }

    // Getters
    public int getExamId() {
        return examId;
    }

    public String getExamName() {
        return examName;
    }

    public int getDuration() {
        return duration;
    }

    public int getPassingScore() {
        return passingScore;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    // Setters
    public void setExamId(int examId) {
        this.examId = examId;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setPassingScore(int passingScore) {
        this.passingScore = passingScore;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    // Method to add question to exam
    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    // Method to calculate total possible score
    public int getTotalPoints() {
        int total = 0;
        for (Question q : questions) {
            total += q.getPoints();
        }
        return total;
    }

    // Method to display exam info
    public void displayExamInfo() {
        System.out.println("Exam: " + examName);
        System.out.println("ID: " + examId);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Passing Score: " + passingScore);
        System.out.println("Total Questions: " + questions.size());
        System.out.println("Total Points: " + getTotalPoints());
    }

    // Method to compare exams by difficulty (passing score)
    public int compareDifficulty(Exam other) {
        return Integer.compare(this.passingScore, other.passingScore);
    }

    @Override
    public String toString() {
        return "Exam{" +
                "examId=" + examId +
                ", examName='" + examName + '\'' +
                ", duration=" + duration +
                ", passingScore=" + passingScore +
                ", questionsCount=" + questions.size() +
                '}';
    }
}