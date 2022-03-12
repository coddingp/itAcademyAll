package com.itCalculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        {
            System.out.println("Type start to run the app");

            Scanner pressTheButton = new Scanner(System.in);
            String startButton = pressTheButton.nextLine();

            Scanner nums = new Scanner(System.in);

            Scanner operationChars = new Scanner(System.in);

            if (startButton.equals("start") || startButton.equals("Start")) {
                com.itCalculator.src.com.company.Calculator calculator = new com.itCalculator.src.com.company.Calculator();
                System.out.println("Enter first number 1 to 1 000 000");
                if (nums.hasNextDouble()) {
                    calculator.setFirst(nums.nextDouble());
                    if (calculator.getFirst() != null) {
                        if (calculator.getFirst() > -2147483648 && calculator.getFirst() < 2147483647) {
                            System.out.println("Enter operation char (+,-,/,*)");
                            if (operationChars.hasNext()) {
                                calculator.setMathChar(operationChars.next());
                                if (calculator.getMathChar() != null) {
                                    System.out.println("Enter second number 1 to 1 000 000");
                                    if (nums.hasNextDouble()) {
                                        calculator.setSecond(nums.nextDouble());
                                        if (calculator.getSecond() != null) {
                                            switch (calculator.getMathChar()) {
                                                case "/" -> calculator.divide();
                                                case "*" -> calculator.multiply();
                                                case "+" -> calculator.add();
                                                case "-" -> calculator.subtract();
                                                default -> System.out.println("Something went wrong! Try again later.\n");
                                            }
                                            System.out.println(calculator.calculate());
                                        }
                                    } else System.out.println("You can use only following chars (+,-,/,*)");
                                } else
                                    System.out.println("you've dialed incorrect datatype. Try toi use next operands((+,-,/,*))  ");
                            } else
                                System.out.println("you've dialed incorrect datatype. Try toi use next operands((+,-,/,*))  ");
                        } else System.out.println("Something went wrong after the first number dial");
                    }
                }
            }
        }
    }
}
