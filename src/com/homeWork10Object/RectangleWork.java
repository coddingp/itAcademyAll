package com.homeWork10Object;

import java.util.Scanner;

public class RectangleWork {

    public static void main(String[] args) {
        com.homeWork10Object.Rectangle rectangle = new com.homeWork10Object.Rectangle();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first side length  ");
        int scnA = scanner.nextInt();
        System.out.println("Enter second side length ");
        int scnB = scanner.nextInt();
        rectangle.setA(scnA);
        rectangle.setB(scnB);
        System.out.println("Square of your rectangle is equal to " + rectangle.getSquare(rectangle.a, rectangle.b));
    }
}
