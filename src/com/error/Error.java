package com.error;

import java.util.Scanner;

public class Error {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positiveNum = sc.nextInt();
        if (positiveNum < 0) Error();
    }
    static void Error() {
        System.out.println("Ошибка программы");
    }
}