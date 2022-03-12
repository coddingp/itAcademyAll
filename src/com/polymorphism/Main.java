package com.polymorphism;

import com.polymorphism.Duck;
import com.polymorphism.Shark;
import com.polymorphism.Swimable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


//        WhiteBoard whiteBoard = new WhiteBoard("Wellcome to IT Academy", 265, "WhiteBoard\n");
//        BlackBoard blackBoard = new BlackBoard("Wellcome to IT Academy here", 265, "BlackBoard\n");
//        WhiteBoard whiteBoard2 = new WhiteBoard("Wellcome to IT Academy again", 265, "WhiteBoard\n");
//
//        System.out.println(whiteBoard);
//        whiteBoard.write();
//
//        System.out.println(whiteBoard2);
//        whiteBoard2.write();
//
//        System.out.println(blackBoard);
//        blackBoard.write();


//        AbstratcAnimal tortle = new Tortle("Dirby\n", 56);
//        System.out.println(tortle);

//        Swimable tortle2 = new Tortle("Drusty\n", 56);
//        System.out.println(tortle2);
//
//        Eggable chicken= new Chicken("Daffy");
//        Eggable[] ChikenAndTortles = new Eggable[2];


//        ChikenAndTortles[0]=chicken;
//        ChikenAndTortles[1]=tortle;

//
//        System.out.println(Arrays.toString(ChikenAndTortles));
//
//        System.out.println(Swimable.swimsOrNot);
//        System.out.println(Eggable.laysEggsOrNot);

        Swimable[] oceanarium = new Swimable[15];
        for (int i = 0; i < oceanarium.length; i++) {
            oceanarium[i] = new Shark(" Barby" + i, 3 * i * 10);
            oceanarium[i].swim();
            oceanarium[i].sound();
            i++;
            oceanarium[i + 5] = new Tortle(" Dirby" + i, 15 * i);
            oceanarium[i].sound();
            oceanarium[i].swim();
            i++;
            oceanarium[i + 10] = new Duck("Clava" + i, 123);
            oceanarium[i].sound();
            oceanarium[i].swim();
        }

        System.out.println(Arrays.toString(oceanarium));

        System.out.println(oceanarium.getClass());

        for (int i = 0; i < oceanarium.length; i++) {
            if (oceanarium[i] instanceof Shark) {
                ((Shark) oceanarium[i]).hunt();
            } else if (oceanarium[i] instanceof Tortle) {
                ((Tortle) oceanarium[i]).careShells();
            } else if (oceanarium[i] instanceof Duck) {
                ((Duck) oceanarium[i]).fly();
            }
        }
    }
}
