package com.comparizons;

import java.util.Scanner;

public class Comparizons {
    public static void main(String[] args) {
        int age = 25;
        if (age >= 25 && age <= 40) System.out.println("Подходит");
        else System.out.println("Не подходит");
        int a = 25;
        int b = 15;
        if (a > b) {
            System.out.println("Андрей старше");
        } else {
            if (a == b) {
                System.out.println("Одного возраста");
            } else {
                System.out.println("Борис старще");
            }
        }
        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter any number in the range from 1 through 12");
        int m = scaner.nextInt();
        switch (m) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Ошибка");
        }
    }
}