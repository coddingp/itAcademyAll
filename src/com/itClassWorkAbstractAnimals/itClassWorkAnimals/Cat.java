package com.itClassWorkAbstractAnimals.itClassWorkAnimals;

public class Cat extends Cats {
    private String name;
    private String bread;

    public Cat(double weight, int age, String color, int claws, double tailLength, int whiskers, String name, String bread) {
        super(weight, age, color, claws, tailLength, whiskers);
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
    public void landOnFeet() {
        System.out.println("The kitten safely landed on its feet.");
    }

    @Override
    public void sleep() {
        System.out.println("Mr-mr-mr");
    }

    @Override
    public void eat() {
        System.out.println("Chunk-chunk-chunk-mr");
    }

    @Override
    public void rest() {
        this.sleep();
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", bread='" + bread + '\'' +
                '}';
    }
}
