package com.circles;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class SetRadius extends Canvas {
    static public String color;
    private int userWidth;
    private int userHeight;
    private int userRadius;

    public SetRadius(String color, int radius) {
        SetRadius.color = color;
        this.userRadius = radius;
        this.userWidth = radius / 2;
        this.userHeight = radius / 2;
    }

    public void setColor(String color) {
        SetRadius.color = color;
    }

    public String getColor() {
        return SetRadius.color;
    }

    public void setUserWidth(int width) {
        this.userWidth = width;
    }

    public double getUserWidth() {
        return this.userWidth;
    }

    public void setUserHeight(int userHeight) {
        this.userHeight = userHeight;
    }

    public double getUserHeight() {
        return userHeight;
    }

    public void setUserRadius(int userRadius) {
        this.userRadius = userRadius;
    }

    public double getUserRadius() {
        return userRadius;
    }

    @Override
    public void paint(Graphics graphics) {
        String userColorScanner = SetRadius.color;
        Color userFirstColor;
        switch (userColorScanner) {
            case "RED":
                userFirstColor = Color.RED;
                break;
            case "WHITE":
                userFirstColor = Color.WHITE;
                break;
            case "BLACK":
                userFirstColor = Color.BLACK;
                break;
            default:
                userFirstColor = Color.BLUE;
        }
        graphics.setColor(userFirstColor);
        // Нас интересует только этот блок
        graphics.fillOval(100, 50, this.userWidth, this.userHeight); // Остальное магия…
    }

    public static void main(String[] args) {
        System.out.println("Enter radius of a circle you want to draw: ");
        Scanner radiusScanner = new Scanner(System.in);
        int userRadiusScanner = 0;
        if (radiusScanner.hasNextInt()) {
            userRadiusScanner = radiusScanner.nextInt();
        } else System.out.println("You have entered invalid data. Try to enter some integers.");
        System.out.println("Enter color (with CAPITALS only) of a circle you want to draw: ");
        Scanner colorScanner = new Scanner(System.in);
        SetRadius.color = colorScanner.nextLine();

        SetRadius canvas = new SetRadius(SetRadius.color, userRadiusScanner);
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(canvas);
        frame.setVisible(true);
    }
}