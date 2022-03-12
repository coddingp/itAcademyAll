package com.polymorphism;

public class Duck implements Swimable {
    String string;
    int id;

    public Duck(String string, int id) {
        this.string = string;
        this.id = id;
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
    public void sound() {
        System.out.println("duckles");
    }

    public void fly() {
        System.out.println("flies");
    }

    @Override
    public String toString() {
        return "Duck{" +
                "string='" + string + '\'' +
                ", id=" + id +
                '}';
    }
}
