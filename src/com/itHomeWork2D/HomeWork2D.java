// Home work 29/10//21 Task D
//        Напишите программу которая получает три числа и
//        выводит количество одинаковых чисел в этой цепочке
//        Все числа одинаковые
//        Нет одинаковых чисел
//        Два числа одинаковые
package com.itHomeWork2D;

import java.util.Scanner;

public class HomeWork2D {

    public static void main(String[] args) {
        System.out.println("Enter 1st number: ");
        Scanner a = new Scanner(System.in);
        int aN = a.nextInt();
        System.out.println("Enter 2nd number: ");
        Scanner b = new Scanner(System.in);
        int bN = a.nextInt();
        System.out.println("Enter 3rd number: ");
        Scanner c = new Scanner(System.in);
        int cN = a.nextInt();

        if (aN == bN && bN == cN) {
            System.out.println("Все числа одинаковые.");
        } else if ((aN == bN && bN != cN && cN != aN) ||
                (aN != bN && bN != cN && cN == aN)
                || (aN != bN && bN == cN && cN != aN)) {
            System.out.println("Два числа одинаковые.");
        } else {
            System.out.println("Нет одинаковых чисел.");
        }


    }
}
