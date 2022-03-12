package com.polymorphism2;

public interface Swimable {
    boolean swimsOrNot = false;
    double depth = 11000;

    default void swim() {
        System.out.println("It able to swim");
    }

    void sound();
}
