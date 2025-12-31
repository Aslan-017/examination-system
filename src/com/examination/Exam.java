package com.examination;

public class Exam extends BaseItem implements Comparable<Exam> {
    private int duration;

    public Exam(int id, String name, int duration) {
        super(id, name);
        setDuration(duration);
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        if (duration <= 0) throw new IllegalArgumentException("duration must be positive");
        this.duration = duration;
    }

    @Override
    public String info() {
        return "Exam: " + getName() + ", ID: " + getId() + ", Duration: " + duration + " minutes";
    }

    @Override
    public String toString() {
        return "Exam{" + "id=" + getId() + ", name='" + getName() + "', duration=" + duration + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exam exam = (Exam) o;
        return getId() == exam.getId();
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(getId());
    }

    @Override
    public int compareTo(Exam other) {
        int cmp = Integer.compare(other.duration, this.duration);
        return (cmp != 0) ? cmp : Integer.compare(this.getId(), other.getId());
    }
}
