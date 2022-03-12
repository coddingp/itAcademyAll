package com.itHomeWork3SecondEdition;

import java.util.Scanner;

public class SecondEdition {

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scn1 = new Scanner(System.in);
        if (scn1.hasNextInt()) {
            String scn1PreN = scn1.nextLine();
            int count = scn1PreN.length();
            int scn1N = Integer.parseInt(scn1PreN);
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
        }
        else{
            System.out.println("Error #2");
        }
    }
}
