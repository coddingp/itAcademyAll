package com.polymorphism2;

import com.polymorphism.AbstractAnimal;

public class Duck extends AbstractAnimal implements Swimable {
    private int feathers;

    public Duck(String name, int feathers) {
        super(name);
        this.feathers = feathers;
    }

    public int getFeathers() {
        return feathers;
    }

    public void setFeathers(int feathers) {
        this.feathers = feathers;
    }


    @Override
    public void swim() {
        System.out.println("It swims");
    }

    @Override
    public void sound() {
        System.out.println("It sound Quack");
    }

    public void fly() {
        System.out.println("it is able to fly");
    }

    @Override
    public String toString() {
        return "Duck{" +
                "feathers=" + feathers +
                '}';
    }
}
