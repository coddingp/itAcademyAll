package com.itHomeWork20DogFinal;

public class Main {
    public static void main(String[] args) {
        System.out.println("First count = " + Dog.count);
        Dog dogFirst = new Dog("Jack", 4.56f);
        System.out.println(dogFirst);
        System.out.println("Second count = " + Dog.count);
        Pitbul.BURK();
    }
}