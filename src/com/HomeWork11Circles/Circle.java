package com.HomeWork11Circles;

public class Circle {
    int radius;
    String color;
    boolean transparent = false;

    public Circle() {

    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(int radius,
                  String color,
                  boolean transparent) {
        this.radius = radius;
        this.color = color;
        this.transparent = transparent;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }


    public void setTransparent(Boolean transparent) {
        this.transparent = transparent;
    }

    public Boolean getTransparent() {
        return transparent;
    }

    public double lengthFromRadius(int lengthFromRadius) {

        return 2 * 3.14 * lengthFromRadius;
    }

    public double circleSquare(int circleSquare) {
        return 3.14 * this.radius * this.radius;
    }
}
