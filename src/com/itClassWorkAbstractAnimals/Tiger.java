package com.itClassWorkAbstractAnimals;

public class Tiger extends AbstractAnimal {
    private String bread;

    public Tiger(double weight, int age, String color, String bread) {
        super(weight, age, color);
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

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "bread='" + bread + '\'' +
                '}';
    }
}
