package com.functionsAndProcedures;

import java.util.Scanner;

public class FunctionsAndProcedures {
    public static void main(String[] args) {
//        sumAndCheck(500, 1200);//first task
        //exchange rates // second task
        System.out.println("Type any available currency from the list: RUB, EUR, USD,KZT");
        Scanner scanData = new Scanner(System.in);
        String currency = scanData.nextLine();
        System.out.println("Enter operation \"SELL\" or \"BUY\"");
        String operation = scanData.nextLine();
        System.out.println("Enter amount of money you want to exchange");
        Scanner scanAmountOfMoney = new Scanner(System.in);
        int amount = scanAmountOfMoney.nextInt();
        System.out.println(ExchangeMoney(currency, operation, amount));
    }

    static void sumAndCheck(int a, int b) {
        if ((a + b) < 1000) {
            System.out.println(a + b);
        } else {
            System.out.println(a + b);
            System.out.println("The sum of the two numbers exceeds 1000");
        }
    }

    static double ExchangeMoney(String currencyCode, String operation, int amount) {
        double rate = 1;
        switch (operation) {
            case "BUY" -> {
                switch (currencyCode) {
                    case "USD" -> rate = 99.5;
                    case "EUR" -> rate = 109.5;
                    case "RUB" -> rate = 1.15;
                    case "KZT" -> rate = 0.5;
                    default -> Error1(currencyCode);
                }
                System.out.println("Your operation: " + amount + " / " + rate + " = " + (amount / rate));
                System.out.println("\nYour operation rate: ");
                return rate;
            }
            case "SELL" -> {
                switch (currencyCode) {
                    case "USD" -> rate = 90.5;
                    case "EUR" -> rate = 95.5;
                    case "RUB" -> rate = 1.05;
                    case "KZT" -> rate = 0.25;
                    default -> Error1(currencyCode);
                }
                System.out.println("Your operation: " + amount + " * " + rate + " = " + (amount * rate));
                System.out.println("\nYour operation rate: ");
                return rate;
            }
            default -> Error2(operation);
        }
        System.out.println("\nYour operation rate: ");
        return rate;
    }

    static void Error1(String scanCurrency) {
        System.out.println("Currency type Error #1: " + scanCurrency + "\nYou've dialed an improper currency type, try again.\nWe have only RUB, EUR, USD, KZT available now.");
    }

    static void Error2(String operation) {
        System.out.println("operation type Error #2: " + operation + "\nYou've dialed an improper operation type, try again.\nWe have only do \"SELL\" or \"BUY\".");
    }
}
