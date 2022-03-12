package com.itClassWorkMultiplication;

import java.util.Scanner;

public class Multyplication {

    public static void main(String[] args) {
        System.out.println("Enter any number: ");
        Scanner scn = new Scanner(System.in);
        int scnNew = scn.nextInt();
        int res = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println(scnNew + " * " + i + " = " + (scnNew * i));
        }
    }
}
