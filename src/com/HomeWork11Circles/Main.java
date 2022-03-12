package com.HomeWork11Circles;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] circles = new int[100];
//        int[] circles1 = new int[100];
        Circle circle = new Circle();
        Random random = new Random();
        int arrayLength = 0;
        int cnt = 0;
        for (int i = 0; i < 100; i++) {
            int rnd1 = random.nextInt((100 - 10) + 1) + 10;
            circle.setRadius(rnd1);
            circles[i] = circle.getRadius();

        }
        for (int j : circles) {
            if (j % 3 == 0) {
                arrayLength++;
//                System.out.println("length in if= " + arrayLength);

            }
        }
//        System.out.println("Here we create length of circlesDivisibleBy3 = " + arrayLength);
        int[] circlesDivisibleBy3 = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            if (circles[i] % 3 == 0) {
                circlesDivisibleBy3[cnt] = circles[i];
//                System.out.println(i);
                cnt++;
            }
        }
        int cnt2 = 0;
//        System.out.println("Total cnt = " + cnt);
        int[] finalDivisibleCircles = new int[cnt];

        for (int i = 0; i < circlesDivisibleBy3.length; i++) {
            if (circlesDivisibleBy3[i] > 0) {
                finalDivisibleCircles[cnt2] = circlesDivisibleBy3[i];
//                System.out.println(cnt2);
                cnt2++;
            }
        }

        System.out.println("finalDivisibleCircles= " + Arrays.toString(finalDivisibleCircles));
        System.out.println("com.circles = " + Arrays.toString(circles));
        System.out.println("You can increase any circle radius by entering any multiplier and the array cell number(from cell 0-99) here: ");
        int multiplier = scanner.nextInt();
        int arrayCellNumber = scanner.nextInt();
        System.out.println("multiplier = " + multiplier + " arrayCellNumber = " + arrayCellNumber);
//        System.out.println("circlesDivisibleBy3 = " + Arrays.toString(circlesDivisibleBy3));
        circles[arrayCellNumber] = (circles[arrayCellNumber]) * multiplier;
        System.out.println(Arrays.toString(circles));
        System.out.println(circle.circleSquare(circles[1]));
    }
}
