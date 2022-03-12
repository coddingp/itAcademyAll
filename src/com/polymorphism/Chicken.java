package com.polymorphism;

public class Chicken extends AbstractAnimal implements Eggable{
    public Chicken(String name) {
        super(name);
    }

    @Override
    public void layEggs() {

    }

}
