package com.itClassWorkAnimals;

public abstract class Animal {
    private static double weight;
    private static int age;
    private static String color;
    public static int count;

    public Animal(double weight, int age, String color) {
        Animal.weight = weight;
        Animal.age = age;
        Animal.color = color;
        count += 1;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        Animal.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        Animal.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        Animal.color = color;
    }


    public void sleep() {

        System.out.println("Mr-mr-mr");
    }


    public void eat() {

        System.out.println("Chunk-chunk-chunk-mr");
    }


    public void rest() {
        this.sleep();
    }
public void sound(){
    System.out.println("It has personal sound like anything personal");
}
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



    public static String myToString() {
        return "Animal{" +
                "weight=" + weight +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}

