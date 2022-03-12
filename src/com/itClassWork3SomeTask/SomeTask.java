//Напишите программу которая будет получать числа до тех пор
//        пока полученное число позитивное

package com.itClassWork3SomeTask;

import java.util.Scanner;

public class SomeTask {

    public static void main(String[] args) {

        System.out.println("Enter a number: ");
        Scanner n1 = new Scanner(System.in);

        if (n1.hasNextInt()) {
            int nN = n1.nextInt();
            if (nN < 0) {
                System.out.println("See you later!");
            } else {

                while (nN >= 0) {
                    System.out.println("Enter a number: ");
                    Scanner n2 = new Scanner(System.in);
                    int n1N = n2.nextInt();
                    if (n1N < 0) {
                        System.out.println("See you later!");
                        break;
                    }
                }
            }
        }
        else{
            System.out.println("You have entered invalid data.\nTry again");
        }

    }
}
