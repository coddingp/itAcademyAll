package com.loop;

public class OOP {
    public static void main(String[] args) {
        Ball ball = new Ball();
        ball.color = "BLUE";
        ball.price = 10;
        ball.radius = 6;
        ball.producer = "China";

        System.out.println(ball);
        System.out.println(ball.color + " "
                + ball.price + " "
                + ball.producer);
    }
}