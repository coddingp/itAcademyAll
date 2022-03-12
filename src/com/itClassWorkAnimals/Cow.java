package com.itClassWorkAnimals;

public class Cow extends Animal {
    private String name;
    private String bread;

    public Cow(double weight, int age, String color, String name, String bread) {
        super(weight, age, color);
        this.name = name;
        this.bread = bread;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    @Override
    public void sleep() {
        System.out.println("Z-z-z");
    }

    @Override
    public void eat() {
        System.out.println("Nyam-nyam");
    }

    @Override
    public void sound() {
        System.out.println("Muu-muu");
    }

    @Override
    public void rest() {
        this.sleep();
    }


    @Override
    public String toString() {
        return "Cow{" +
                "name='" + name + '\'' +
                ", bread='" + bread + '\'' +
                '}';
    }
}
