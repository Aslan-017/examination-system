package com.examination;

public class Main {
    public static void main(String[] args) {

        Question question1 = new Question(1, "What is Java?", 10);
        Question question2 = new Question(2, "What is a class?", 5);

        System.out.println("=== Questions ===");
        question1.display();
        question2.display();
        System.out.println();

        Candidate candidate1 = new Candidate(101, "Aidar", 25);
        Candidate candidate2 = new Candidate(102, "Aizhan", 30);

        System.out.println("=== Candidates ===");
        candidate1.display();
        candidate2.display();
        System.out.println();

        Exam exam1 = new Exam(1, "Java Basics", 60);
        Exam exam2 = new Exam(2, "Java Advanced", 90);

        System.out.println("=== Exams ===");
        exam1.display();
        exam2.display();
        System.out.println();

        System.out.println("=== Comparison ===");

        if (candidate1.getScore() > candidate2.getScore()) {
            System.out.println(candidate1.getName() + " has more points");
        } else {
            System.out.println(candidate2.getName() + " has more points");
        }

        if (exam1.getDuration() > exam2.getDuration()) {
            System.out.println(exam1.getName() + " is longer");
        } else {
            System.out.println(exam2.getName() + " is longer");
        }

        System.out.println();
        System.out.println("=== Changing data ===");
        candidate1.setScore(35);
        System.out.println("Updated candidate1 score:");
        candidate1.display();
    }
}