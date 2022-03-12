//        Home work2 29/10/21 Задача E
//        Напишите программу, которая получает номер месяца и
//        выводит соответствующее ему месяц или сообщение об ошибке
package com.itHomeWork2E;

import java.util.Scanner;

public class HomeWork2E {

    public static void main(String[] args) {
        System.out.println("Enter month's number:  ");
        Scanner month = new Scanner(System.in);

        if (month.hasNextInt()) {
            int monthN = month.nextInt();
            switch (monthN) {
                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("February");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("August");
                    break;
                case 9:
                    System.out.println("September");
                    break;
                case 10:
                    System.out.println("October");
                    break;
                case 11:
                    System.out.println("November");
                    break;
                case 12:
                    System.out.println("December");
                    break;

                default:
                    System.out.println("Error # " + monthN);
            }
        }
        else {
            System.out.println("Error # FZX15 " + "Your input is not a number!");
            System.out.println("Try again by entering a valid data.");
        }
    }
}


