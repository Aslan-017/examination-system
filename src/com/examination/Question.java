package com.examination;

public class Question extends BaseItem implements Comparable<Question> {
    private int points;

    public Question(int id, String text, int points) {
        super(id, text);
        setPoints(points);
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        if (points < 0) throw new IllegalArgumentException("points must be non-negative");
        this.points = points;
    }

    @Override
    public String info() {
        return "Question " + getId() + ": " + getName() + " (" + points + " points)";
    }

    @Override
    public String toString() {
        return "Question{" + "id=" + getId() + ", text='" + getName() + "', points=" + points + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question = (Question) o;
        return getId() == question.getId();
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(getId());
    }

    @Override
    public int compareTo(Question other) {
        int cmp = Integer.compare(other.points, this.points);
        return (cmp != 0) ? cmp : Integer.compare(this.getId(), other.getId());
    }
}
