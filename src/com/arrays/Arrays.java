package com.arrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int size = 10;
        int[] numbers = new int[size];
        System.out.println(numbers[0]);

        Scanner sc = new Scanner(System.in);
        numbers[0] = sc.nextInt();
        System.out.println("Enter any number ");
        int size2 = sc.nextInt();
        int[] numbers2 = new int[size2];
        numbers2[0] = sc.nextInt();
        System.out.println(numbers2[2]);
    }
}
