package com.temp;

public class Temp {

    public static void main(String[] args) {
        // How dose com.temp variable works

        int[] a = new int[3];

        int temp = 15;
        int i = 0;
        //int j = 0;
        a[i] = 0;
        for (i = 0; i < 3; i++) {
            System.out.println();
            a[i] = temp;
            temp = temp + 15;
            System.out.print(a[i] + " ");
        }
    }
}

