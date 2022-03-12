package com.polymorphism;

import com.polymorphism2.ShellsCareble;

public class Tortle extends AbstractAnimal implements AbilitiesOfTortles, ShellsCareble {

    private int age;

    public Tortle(String name, int age) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Tortle{" +
                "age=" + age +
                '}';
    }

    @Override
    public void layEggs() {
        System.out.println("It lays eggs");

    }

    @Override
    public void careShell() {
        System.out.println("It cares shells");
    }


    @Override
    public void swim() {
        System.out.println("It swims");
    }

    @Override
    public void sound() {
        System.out.println("THere is no sound");
    }

    @Override
    public void careShells() {
        System.out.println("it cares shells");
    }
}
