package com.itClassWorkAnimals;

public abstract class Cats extends Animal {
    private int claws;
    private double tailLength;
    private int whiskers;

    public Cats(double weight, int age, String color, int claws, double tailLength, int whiskers) {
        super(weight, age, color);
        this.claws = claws;
        this.tailLength = tailLength;
        this.whiskers = whiskers;
    }

    public int getClaws() {
        return claws;
    }

    public void setClaws(int claws) {
        this.claws = claws;
    }

    public double getTailLength() {
        return tailLength;
    }

    public void setTailLength(double tailLength) {
        this.tailLength = tailLength;
    }

    public int getWhiskers() {
        return whiskers;
    }

    public void setWhiskers(int whiskers) {
        this.whiskers = whiskers;
    }


    public void myao() {
        System.out.println("Myao");
    }

    @Override
    public void sound() {
        this.myao();
    }

    public abstract void landOnFeet();

    @Override
    public String toString() {
        return "Cats{" +
                "claws=" + claws +
                ", tailLength=" + tailLength +
                ", whiskers=" + whiskers +
                '}';
    }
}
