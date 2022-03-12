package com.itClassWork32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
//    public static void main(String[] args) throws FileNotFoundException {

//    Cat cat = new Cat(12, "Sybirka");
//    Cat cat1 = new Cat(8, "Myshka");
//    Cat cat2 = new Cat(12, "Sybirka");
//    Cat cat3 = new Cat(5, "Myshkar");
//
//
//        System.out.println(hash(cat));
//        System.out.println(hash(cat1));
//
//    ArrayList<Cat> catsList = new ArrayList<>();
//        catsList.add(cat);
//        catsList.add(cat1);
//        catsList.add(cat2);
//        catsList.add(cat3);
//    int count = 0;
//
//        for (int i = 0; i < catsList.size(); i++) {
//        if (i + 1 < catsList.size()) {
//            for (Cat value : catsList) {
//                if (hash(catsList.get(i)) == (hash(value))) {
//                    count++;
//                }
//            }
//        }
//    }
//
//        System.out.println(count);

//
//        StringBuilder string = new StringBuilder();
//        for (int i = 0; i < catHashes.length(); i++){
//            string.append(reader);
//        }
//
//        System.out.println(string);


    //    }
    public static void main(String[] args) {
        Scanner scanLength = new Scanner(System.in);
        System.out.println("Enter length of multiples you need");
        int userLength = scanLength.nextInt();
        Multiple multiple = new Multiple();
        ArrayList<Multiple> multiples = new ArrayList<>();
        ArrayList<Integer> temps = new ArrayList<>();
        Multiple[] multipleInts = new Multiple[userLength];

        for (int i = 0; i < userLength; i++){
            multipleInts[i] = add(temps,multiples,multiple);
        }

        for (int i = 0; i < multipleInts.length; i++){
            if (multipleInts[i]!=null) {
                multiples.add(multipleInts[i]);
            }
        }

        System.out.println(Arrays.toString(multipleInts));
    }

    public static Multiple add(ArrayList<Integer> temps,ArrayList<Multiple> multiples, Multiple multiple) {
        Scanner scanInteger = new Scanner(System.in);
        System.out.println("Enter first Integer: ");
        Multiple.setA(scanInteger.nextInt());
        System.out.println("Enter second Integer: ");
        Multiple.setB(scanInteger.nextInt());
        if (!temps.contains(Multiple.getA() * Multiple.getB())) {
            multiples.add(multiple);
            temps.add(Multiple.getA() * Multiple.getB());
        }
        return multiple;
    }
}
