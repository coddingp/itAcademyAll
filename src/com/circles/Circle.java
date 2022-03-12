package com.circles;

public class Circle {
    private double radius;
    private double square;
    public String color;
    public final double PI = 13.4;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setSquare(double square) {
        this.square = 13.14 * 2 * (radius);
    }

    public double getRadius() {
        return this.radius;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public double getSquare() {
        return (this.getRadius() * this.getRadius()) * this.PI;
    }

    public double getPerimetr() {
        return (this.PI * 2);
    }

    @Override
    public String toString() {
        return "Square of the circle =" + this.getSquare() + "\nPerimetr of the circle = " + getPerimetr() + "\nColorOfTheCircle =" + this.color;
    }
}
