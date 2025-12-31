package com.examination;

public abstract class BaseItem {
    private int id;
    private String name;

    public BaseItem(int id, String name) {
        setId(id);
        setName(name);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    protected void setId(int id) {
        if (id <= 0) throw new IllegalArgumentException("id must be positive");
        this.id = id;
    }

    protected void setName(String name) {
        if (name == null) throw new NullPointerException("name is null");
        name = name.trim();
        if (name.isEmpty()) throw new IllegalArgumentException("name is empty");
        this.name = name;
    }

    public abstract String info();

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" + "id=" + id + ", name='" + name + "'" + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseItem other = (BaseItem) o;
        return id == other.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}
