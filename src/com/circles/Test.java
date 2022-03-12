package com.circles;

import javax.swing.*;
import java.awt.*;

public class Test extends Canvas {
    String color;

    public Test(String color) {
        this.color = color;
    }

    @Override
    public void paint(Graphics graphics) {
        graphics.setColor(Color.MAGENTA);
        // Нас интересует только этот блок
        graphics.fillOval(100, 50, 200, 200); // Остальное магия…
    }

    public static void main(String[] args) {
        Circle redCircle = new Circle(18, "BLUE");
        Test canvas = new Test(redCircle.getColor());
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(canvas);
        frame.setVisible(true);
    }


}