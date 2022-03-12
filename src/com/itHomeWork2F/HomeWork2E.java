//// Home Work Task 3
//        Напишите программу, которая получает возраст человека
//        (целое число, не превышающее 120) и выводит этот возраст со словом
//        «год», «года» или «лет». Например, «21 год», «22 года», «25 лет».

package com.itHomeWork2F;

import java.util.Scanner;

public class HomeWork2E {

    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner age = new Scanner(System.in);
        int a = age.nextInt();
        String let = " лет";
        String god = " год";
        String goda = " года";
        if(a<=120) {
            if (a != 11 && a != 12 && a != 13 && a != 14 && a != 111 && a != 112 && a != 113 && a != 114) {
                if (a % 10 == 1) {
                    System.out.println("Вам " + a + god);

                } else if (a % 10 == 5 || a % 10 == 7 || a % 10 == 8 || a % 10 == 9 || a % 10 == 0) {
                    System.out.println("Вам " + a + let);
                } else if (a % 10 == 2 || a % 10 == 3 || a % 10 == 4) {
                    System.out.println("Вам " + a + goda);
                }
            } else {
                System.out.println("Вам " + a + let);
            }
        }
        else{
            System.out.println("You have entered invalid data.\nTry again!");
        }
    }
}
