package com.itClassWorkAbstractAnimals;

public class Cow extends AbstractAnimal {
    public static String name;
    public static String bread;

    public Cow(double weight, int age, String color, String name, String bread) {
        super(weight, age, color);
        Cow.name = name;
        Cow.bread = bread;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Cow.name = name;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        Cow.bread = bread;
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



    public static String myToString() {
        return "Cow{" +
                "name='" + name + '\'' +
                ", bread='" + bread + '\'' +
                '}';
    }
}
