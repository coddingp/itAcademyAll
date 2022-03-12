package com.polymorphism2;

public class Shark extends com.polymorphism.AbstractAnimal implements Swimable, Huntable {
    private int teeth;

    public Shark(String name, int teeth) {
        super(name);
        this.teeth = teeth;
    }

    public int getTeeth() {
        return teeth;
    }

    public void setTeeth(int teeth) {
        this.teeth = teeth;
    }


    @Override
    public void sound() {
        System.out.println("I give no sound, except for burping");
    }

    @Override
    public String toString() {
        return "Shark{" +
                "teeth=" + teeth +
                '}';
    }


    @Override
    public void hunt() {
        System.out.println("shark started to hunt");
    }
}
