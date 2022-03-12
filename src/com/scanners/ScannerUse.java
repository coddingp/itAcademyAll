package com.scanners;

import java.util.Scanner;

public class ScannerUse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два целых числа");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(a + " + " + b + " = " + sum);
        float c = 0.5f;
        System.out.printf("%.2f", c);
    }
}
