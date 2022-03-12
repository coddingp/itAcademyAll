package com.itClassWork3MultyplicationwithoutMultyplication;

import java.util.Scanner;

public class Multyplication {

    public static void main(String[] args) {
        System.out.println("Enter any of two numbers: ");
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);

        int res = 0;

        if (num1.hasNextInt() && num2.hasNextInt()) {
            int num1N = num1.nextInt();
            int temp1 = num1N;
            int num2N = num2.nextInt();
            int temp2 = num2N;
            if (temp1 >= 0 && temp2 > 0) {
                while (temp2 > 0 && temp1 > 0){
                    res += temp1;
                    temp2--;
                }
            } else if (temp2 < 0 && temp1 < 0) {
                while (temp2 < 0) {
                    res -= temp1;
                    temp2++;
                }
            } else if (temp2 < 0 && temp1 > 0) {
                while (temp2 < 0) {
                    res += temp1 * (-1);
                    temp2++;
                }
            } else{
                while (temp2 > 0) {
                    res -= temp1 * (-1);
                    temp2--;
                }
            }

            System.out.println(num1N + " * " + num2N + " = " + res);
        } else {
            System.out.println("You have entered invalid data.\nTry again. ");
        }
    }

}
