package com.examination;

public class Candidate {
    private int candidateId;
    private String name;
    private String email;
    private int score;
    private boolean hasPassed;

    // Default constructor
    public Candidate() {
        this.candidateId = 0;
        this.name = "";
        this.email = "";
        this.score = 0;
        this.hasPassed = false;
    }

    // Constructor with parameters
    public Candidate(int candidateId, String name, String email) {
        this.candidateId = candidateId;
        this.name = name;
        this.email = email;
        this.score = 0;
        this.hasPassed = false;
    }

    // Full constructor
    public Candidate(int candidateId, String name, String email, int score, boolean hasPassed) {
        this.candidateId = candidateId;
        this.name = name;
        this.email = email;
        this.score = score;
        this.hasPassed = hasPassed;
    }

    // Getters
    public int getCandidateId() {
        return candidateId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getScore() {
        return score;
    }

    public boolean isHasPassed() {
        return hasPassed;
    }

    // Setters
    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setHasPassed(boolean hasPassed) {
        this.hasPassed = hasPassed;
    }

    // Method to add points to score
    public void addScore(int points) {
        this.score += points;
    }

    // Method to check if candidate passed based on passing score
    public void evaluateResult(int passingScore) {
        this.hasPassed = this.score >= passingScore;
    }

    // Method to display candidate info
    public void displayInfo() {
        System.out.println("Candidate: " + name);
        System.out.println("ID: " + candidateId);
        System.out.println("Email: " + email);
        System.out.println("Score: " + score);
        System.out.println("Status: " + (hasPassed ? "PASSED" : "FAILED"));
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "candidateId=" + candidateId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", score=" + score +
                ", hasPassed=" + hasPassed +
                '}';
    }
}