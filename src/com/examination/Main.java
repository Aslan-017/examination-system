package com.examination;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Online Examination System ===\n");

        // Creating Questions
        String[] options1 = {"Paris", "London", "Berlin", "Madrid"};
        Question question1 = new Question(1, "What is the capital of France?", options1, "Paris", 10);

        String[] options2 = {"2", "3", "4", "5"};
        Question question2 = new Question(2, "What is 2 + 2?", options2, "4", 5);

        String[] options3 = {"Java", "Python", "C++", "JavaScript"};
        Question question3 = new Question(3, "Which language is known for 'Write Once, Run Anywhere'?", options3, "Java", 15);

        System.out.println("--- Questions Created ---");
        System.out.println(question1);
        System.out.println(question2);
        System.out.println(question3);
        System.out.println();

        // Displaying a question
        question1.displayQuestion();
        System.out.println("Correct answer: " + question1.checkAnswer("Paris"));
        System.out.println();

        // Creating Candidates
        Candidate candidate1 = new Candidate(101, "Aidar Bekzhanov", "aidar@example.com");
        Candidate candidate2 = new Candidate(102, "Aizhan Nurbekova", "aizhan@example.com");
        Candidate candidate3 = new Candidate(103, "Damir Suleimenov", "damir@example.com");

        System.out.println("--- Candidates Created ---");
        System.out.println(candidate1);
        System.out.println(candidate2);
        System.out.println(candidate3);
        System.out.println();

        // Simulating exam results
        candidate1.addScore(10); // answered question 1 correctly
        candidate1.addScore(5);  // answered question 2 correctly
        candidate1.addScore(15); // answered question 3 correctly
        candidate1.evaluateResult(20);

        candidate2.addScore(10); // answered question 1 correctly
        candidate2.addScore(5);  // answered question 2 correctly
        candidate2.evaluateResult(20);

        candidate3.addScore(5);  // answered only question 2 correctly
        candidate3.evaluateResult(20);

        System.out.println("--- Candidates Results ---");
        candidate1.displayInfo();
        System.out.println();
        candidate2.displayInfo();
        System.out.println();
        candidate3.displayInfo();
        System.out.println();

        // Creating Exams
        Exam exam1 = new Exam(1, "Java Programming Basics", 60, 20);
        exam1.addQuestion(question1);
        exam1.addQuestion(question2);
        exam1.addQuestion(question3);

        Exam exam2 = new Exam(2, "Advanced Java Concepts", 90, 50);

        System.out.println("--- Exams Created ---");
        System.out.println(exam1);
        System.out.println(exam2);
        System.out.println();

        exam1.displayExamInfo();
        System.out.println();

        // Comparing objects
        System.out.println("--- Comparing Candidates ---");
        System.out.println(candidate1.getName() + " score: " + candidate1.getScore());
        System.out.println(candidate2.getName() + " score: " + candidate2.getScore());
        if (candidate1.getScore() > candidate2.getScore()) {
            System.out.println(candidate1.getName() + " scored higher!");
        } else if (candidate1.getScore() < candidate2.getScore()) {
            System.out.println(candidate2.getName() + " scored higher!");
        } else {
            System.out.println("Both candidates have the same score!");
        }
        System.out.println();

        System.out.println("--- Comparing Exams ---");
        int comparison = exam1.compareDifficulty(exam2);
        if (comparison < 0) {
            System.out.println(exam1.getExamName() + " is easier than " + exam2.getExamName());
        } else if (comparison > 0) {
            System.out.println(exam1.getExamName() + " is harder than " + exam2.getExamName());
        } else {
            System.out.println("Both exams have the same difficulty level!");
        }
        System.out.println();

        System.out.println("--- Comparing Questions ---");
        System.out.println("Question 1 points: " + question1.getPoints());
        System.out.println("Question 2 points: " + question2.getPoints());
        if (question1.getPoints() > question2.getPoints()) {
            System.out.println("Question 1 is worth more points!");
        } else {
            System.out.println("Question 2 is worth more points!");
        }
    }
}