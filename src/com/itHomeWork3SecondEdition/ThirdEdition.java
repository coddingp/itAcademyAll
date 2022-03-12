package com.itHomeWork3SecondEdition;

import java.util.Scanner;

public class ThirdEdition {

    public static void main(String[] args) {
        // Последняя задача в презентации 4. Ввести натуральное число и определить, верно ли,
        // что в его записи есть две одинаковые цифры, стоящие рядом.
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        int naturalNumber = scan.nextInt();
        boolean isNear = false;
        int temp = 10;
        while (naturalNumber > 0) {
            if (naturalNumber % 10 == naturalNumber / 10 % 10) {
                isNear = true;
                break;
            }
            naturalNumber /= 10;
        }
        if (isNear) {
            System.out.println("В данном числе есть 2 одинаковые цифры, стоящие рядом.");
        } else {
            System.out.println("В данном числе нет 2 одинаковых цифр, стоящих рядом.");
        }
    }
}