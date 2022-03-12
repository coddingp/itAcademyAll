package com.itClassWorkAbstractAnimals;

public abstract class AbstractAnimal {
    private double weight;
    private int age;
    private String color;
    public static int count;

    public AbstractAnimal(double weight, int age, String color) {
        this.weight = weight;
        this.age = age;
        this.color = color;
        count += 1;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public abstract void sleep();

    public abstract void eat();

    public abstract void sound();

    public abstract void rest();

    public void live() {
        sound();
        eat();
    }

    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + weight +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
