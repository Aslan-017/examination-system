package com.examination;

public class Question {
    private int questionId;
    private String questionText;
    private String[] options;
    private String correctAnswer;
    private int points;

    // Default constructor
    public Question() {
        this.questionId = 0;
        this.questionText = "";
        this.options = new String[4];
        this.correctAnswer = "";
        this.points = 1;
    }

    // Constructor with parameters
    public Question(int questionId, String questionText, String[] options, String correctAnswer, int points) {
        this.questionId = questionId;
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
        this.points = points;
    }

    // Getters
    public int getQuestionId() {
        return questionId;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String[] getOptions() {
        return options;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public int getPoints() {
        return points;
    }

    // Setters
    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    // Method to check if answer is correct
    public boolean checkAnswer(String answer) {
        return this.correctAnswer.equalsIgnoreCase(answer);
    }

    // Method to display question
    public void displayQuestion() {
        System.out.println("Question #" + questionId + ": " + questionText);
        for (int i = 0; i < options.length; i++) {
            System.out.println((char)('A' + i) + ") " + options[i]);
        }
    }

    @Override
    public String toString() {
        return "Question{" +
                "questionId=" + questionId +
                ", questionText='" + questionText + '\'' +
                ", points=" + points +
                '}';
    }
}