////itClassTaskB
////        A: Напишите программу которая получает два целых числа A и B
////        (0 < A < B)
////        и выводит квадраты всех натуральных чисел в интервале от A и B.
//package com.itClass3Cicles.com.tsThroughException.src.com.company;
//
//import java.util.Scanner;
//
//public class HashMap {
//
//    public static void main(String[] args) {
//        System.out.println("Enter 4 digits number: ");
//        Scanner fourDigitsNum  = new Scanner(System.in);
//        int fourDigitsNumN = fourDigitsNum.nextInt();
//        int i=4;
//        while (i>1) {
//            System.out.println(fourDigitsNumN*2);
//            fourDigitsNumN=fourDigitsNumN/10;
//            i--;
//        }
//    }
//}
package com.itClass3Cicles;

import java.util.Scanner;

public class HashMap {

    public static void main(String[] args) {
        System.out.println("Enter the first number: ");
        Scanner first = new Scanner(System.in);
        int firstN = first.nextInt();
        System.out.println("Enter the second number: ");
        Scanner second = new Scanner(System.in);
        int secondN = second.nextInt();
        while (firstN <= secondN) {
            System.out.println(firstN * firstN);
            firstN++;
        }
    }
}
//        Задача Б Напишите программу которая получает два целых числа и находит
//        их произведение, не используя операцию умножения.
//        Учтите, что числа могут быть отрицательными.



