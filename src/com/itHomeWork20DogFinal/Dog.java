package com.itHomeWork20DogFinal;

public class Dog {
    private String name;
    private float weight;
    public static int count;

    public Dog(String name,
               float weight) {
        this.name = name;
        this.weight = weight;
        count++;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public static void BURK() {
        System.out.println("burk, burk");
    }

    @Override
    public String toString() {
        return "Собака по кличке " + getName() + " " + weight + " кг";

    }

}