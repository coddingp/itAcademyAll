//Ввести натуральное число и определить,
// верно ли, что в его записи есть две одинаковые цифры, стоящие рядом?

package com.itHomeWork3;

import java.util.Scanner;

public class HomeWork3 {

    public static void main(String[] args) {
        System.out.println("Enter any number: ");
        Scanner scn1 = new Scanner(System.in);
        if (scn1.hasNextInt()) {
            int scn1N = scn1.nextInt();
//Здесь идет длинная подгогтовка чтобы получить длину введенных данных,
// чтобы затем использовать ее как каунт.
            int count = 0;
            if (scn1N < 10 && scn1N >= 0)
                count = 1;
            else {
                if (scn1N < 100 && scn1N > 9)
                    count = 2;
                else {
                    if (scn1N < 1000 && scn1N > 99)
                        count = 3;
                    else {
                        if (scn1N < 10000 && scn1N > 999)
                            count = 4;
                        else {
                            if (scn1N < 100000 && scn1N > 9999)
                                count = 5;
                            else {
                                if (scn1N < 1000000 && scn1N > 99999) {
                                    count = 6;
                                } else {
                                    if (scn1N < 10000000 && scn1N > 999999) {
                                        count = 7;
                                    } else {
                                        if (scn1N < 100000000 && scn1N > 9999999) {
                                            count = 8;
                                        } else {
                                            if (scn1N < 1000000000 && scn1N > 99999999) {
                                                count = 9;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

            String answer = "";
            int a[] = new int[count];
            int i = 0;
            int temp2 = a.length;
            int[] temp = new int[count];
            do {
                temp[i] = scn1N % 10;
                scn1N = scn1N / 10;
                i = i + 1;
            } while (i < temp2);
            for (i = 0; i < count - 1; i++) {
                int i2 = i + 1;
                if (temp[i] == temp[i2]) {
                    answer = "Yes";
                }
            }
            if (answer == "Yes") {
                System.out.println(answer);
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("You have entered incorrect data. \nTry again");
        }
    }
}