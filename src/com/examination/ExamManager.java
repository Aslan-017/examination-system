package com.examination;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExamManager {
    private final List<Candidate> candidates = new ArrayList<>();
    private final List<Exam> exams = new ArrayList<>();
    private final List<Question> questions = new ArrayList<>();

    public void addCandidate(Candidate c) {
        if (c == null) throw new NullPointerException();
        if (findCandidateById(c.getId()) != null) throw new IllegalArgumentException();
        candidates.add(c);
    }

    public Candidate findCandidateById(int id) {
        for (Candidate c : candidates) if (c.getId() == id) return c;
        return null;
    }

    public List<Candidate> getCandidatesSortedByScore() {
        List<Candidate> copy = new ArrayList<>(candidates);
        Collections.sort(copy);
        return copy;
    }

    public List<Candidate> findCandidatesByName(String part) {
        if (part == null) return Collections.emptyList();
        part = part.trim().toLowerCase();
        List<Candidate> result = new ArrayList<>();
        for (Candidate c : candidates) if (c.getName().toLowerCase().contains(part)) result.add(c);
        return result;
    }

    public void addExam(Exam e) {
        if (e == null) throw new NullPointerException();
        if (findExamById(e.getId()) != null) throw new IllegalArgumentException();
        exams.add(e);
    }

    public Exam findExamById(int id) {
        for (Exam e : exams) if (e.getId() == id) return e;
        return null;
    }

    public List<Exam> getExamsSortedByDuration() {
        List<Exam> copy = new ArrayList<>(exams);
        Collections.sort(copy);
        return copy;
    }

    public void addQuestion(Question q) {
        if (q == null) throw new NullPointerException();
        if (findQuestionById(q.getId()) != null) throw new IllegalArgumentException();
        questions.add(q);
    }

    public Question findQuestionById(int id) {
        for (Question q : questions) if (q.getId() == id) return q;
        return null;
    }

    public List<Question> getQuestionsSortedByPoints() {
        List<Question> copy = new ArrayList<>(questions);
        Collections.sort(copy);
        return copy;
    }
}
