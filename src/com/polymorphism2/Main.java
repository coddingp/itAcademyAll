package com.polymorphism2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Swimable[] oceanarium = new Swimable[15];
        for (int i = 0; i < 5; i++) {
            oceanarium[i] = new Shark(" Barby" + i, 3 * i * 10);
            oceanarium[i].swim();
            oceanarium[i].sound();

            oceanarium[i + 5] = (Swimable) new Turtle(" Dirby" + i, 15 * i);
            oceanarium[i + 5].sound();
            oceanarium[i + 5].swim();

            oceanarium[i + 10] = new Duck("Clava" + i, 113 * i + 101 - (i * 10 - i) + i * 2);
            oceanarium[i + 10].sound();
            oceanarium[i + 10].swim();
        }

        System.out.println(Arrays.toString(oceanarium));

        System.out.println(oceanarium.getClass());

        for (int i = 0; i < oceanarium.length; i++) {
            if (oceanarium[i] instanceof Shark) {
                ((Shark) oceanarium[i]).hunt();
            } else if (oceanarium[i] instanceof Turtle) {
                ((Turtle) oceanarium[i]).careShells();
            } else if (oceanarium[i] instanceof Duck) {
                ((Duck) oceanarium[i]).fly();
            }
        }
        Shark[] sharks = new Shark[5];
        Turtle[] turtles = new Turtle[5];
        Duck[] ducks = new Duck[5];
        int a = 0;
        for (int i = 0; i < oceanarium.length; i++) {
            if (oceanarium[i] instanceof Duck) {
                ducks[a] = ((Duck) oceanarium[i]);
                a++;
            }
        }
        a = 0;
        for (int i = 0; i < oceanarium.length; i++) {
            if (oceanarium[i] instanceof Shark) {
                sharks[a] = ((Shark) oceanarium[i]);
                a++;
            }
        }
        a = 0;
        for (int i = 0; i < oceanarium.length; i++) {
            if (oceanarium[i] instanceof Turtle) {
                turtles[a] = ((Turtle) oceanarium[i]);
                a++;
            }
        }

        System.out.println(Arrays.toString(sharks));
        System.out.println(Arrays.toString(turtles));
        System.out.println(Arrays.toString(ducks));

    }
}
