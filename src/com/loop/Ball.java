package com.loop;

public class Ball {
    String color;
    String producer;
    int price;
    int radius;

    public Ball() {

    }

    public Ball(String color, String producer, int price, int radius) {
        this.color = color;
        this.producer = producer;
        this.price = price;
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", producer='" + producer + '\'' +
                ", price=" + price +
                ", radius=" + radius +
                '}';
    }
}
