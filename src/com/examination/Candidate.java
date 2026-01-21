package com.examination;

public class


Candidate extends BaseItem implements Comparable<Candidate> {
    private int score;

    public Candidate(int id, String name, int score) {
        super(id, name);
        setScore(score);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score < 0) throw new IllegalArgumentException("score must be non-negative");
        this.score = score;
    }

    @Override
    public String info() {
        return "Candidate: " + getName() + ", ID: " + getId() + ", Score: " + score;
    }

    @Override
    public String toString() {
        return "Candidate{" + "id=" + getId() + ", name='" + getName() + "', score=" + score + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candidate candidate = (Candidate) o;
        return getId() == candidate.getId();
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(getId());
    }

    @Override
    public int compareTo(Candidate other) {
        int cmp = Integer.compare(other.score, this.score);
        return (cmp != 0) ? cmp : Integer.compare(this.getId(), other.getId());
    }
}
