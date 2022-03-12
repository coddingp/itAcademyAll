package com.polymorphism;

import java.util.Objects;

public class Shark implements Swimable {
    String string;
    int id;

    public Shark(String string, int id) {
        this.id = id;
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void swim() {
        System.out.println("swims");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shark shark = (Shark) o;
        return id == shark.id && Objects.equals(string, shark.string);
    }

    @Override
    public int hashCode() {
        return Objects.hash(string, id);
    }

    @Override
    public void sound() {
        System.out.println("no sound");
    }

    public void hunt() {
        System.out.println("hunts");
    }

    @Override
    public String toString() {
        return "Shark{" +
                "string='" + string + '\'' +
                ", id=" + id +
                '}';
    }
}
