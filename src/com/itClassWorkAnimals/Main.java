package com.itClassWorkAnimals;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[10];
        Cat[] firstCats = new Cat[2];


        Cat firstCat = new Cat(2.4, 4, "RED", 20, 25.6, 6, "Kitty", "Kyrgyz Bold");
        animals[Animal.count - 1] = firstCat;
        firstCats[0] = firstCat;

        Cat thirdCat = new Cat(2.4 + 5, 4 + 5, "BLUE", 20 - 1, 25.6 + 5, 6 + 5, "BLUE-Kitty", "BLUE- Bold");
        animals[Animal.count - 1] = thirdCat;
        firstCats[1] = thirdCat;

        Cow firstCow = new Cow(415, 5, "Brown", "Borka", "Scotland Cow");
        animals[Animal.count - 1] = firstCow;

        Tiger firstTiger = new Tiger(235, 7, "Striped", "Siberian");
        animals[Animal.count - 1] = firstTiger;


        System.out.println(firstCat);
        System.out.println(firstCow);
        firstCat.sleep();
        firstCat.live();
        firstTiger.sound();

        Cat secondCat = new Cat(2.4 - 1, 4 - 1, "NOT-RED", 20 - 1, 25.6 - 1, 6 - 1, "NOT-Kitty", "NOT-Kyrgyz Bold");
        animals[Animal.count - 1] = secondCat;

        Cow secondCow = new Cow(415 - 1, 5 - 1, "NOT-Brown", "NOT-Borka", "NOT-Scotland Cow");
        animals[Animal.count - 1] = secondCow;

        Tiger secondTiger = new Tiger(235 - 1, 7, "NOT-Striped", "NOT-Siberian");
        animals[Animal.count - 1] = secondTiger;


        System.out.println("The array of animals with abstract modifier works this way: " + Arrays.toString(animals));

        System.out.println("The array of cats without abstract modifier works this way: " + Arrays.toString(firstCats));

        System.out.println(com.itClassWorkAbstractAnimals.Cow.myToString());

        com.itClassWorkAnimals.Main.main(args);

    }

}
