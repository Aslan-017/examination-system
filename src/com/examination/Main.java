package com.examination;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ExamManager manager = new ExamManager();

        manager.addQuestion(new Question(1, "What is Java?", 10));
        manager.addQuestion(new Question(2, "What is a class?", 5));

        System.out.println("=== Questions ===");
        List<Question> qs = manager.getQuestionsSortedByPoints();
        for (Question q : qs) System.out.println(q.info());
        System.out.println();

        manager.addCandidate(new Candidate(101, "Aidar", 25));
        manager.addCandidate(new Candidate(102, "Aizhan", 30));
        manager.addCandidate(new Candidate(103, "Bota", 30));

        System.out.println("=== Candidates ===");
        List<Candidate> cs = manager.getCandidatesSortedByScore();
        for (Candidate c : cs) System.out.println(c.info());
        System.out.println();

        manager.addExam(new Exam(1, "Java Basics", 60));
        manager.addExam(new Exam(2, "Java Advanced", 90));

        System.out.println("=== Exams ===");
        List<Exam> es = manager.getExamsSortedByDuration();
        for (Exam e : es) System.out.println(e.info());
        System.out.println();

        System.out.println("=== Search ===");
        List<Candidate> found = manager.findCandidatesByName("ai");
        for (Candidate f : found) System.out.println(f.info());

        System.out.println();
        System.out.println("=== Update ===");
        Candidate c = manager.findCandidateById(101);
        if (c != null) {
            c.setScore(35);
            System.out.println(c.info());
        }
    }
}
