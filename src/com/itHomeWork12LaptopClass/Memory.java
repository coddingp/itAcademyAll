package com.itHomeWork12LaptopClass;

public class Memory {
    String model;
    double size;


    public Memory(String model,
                  double size) {
        this.model = model;
        this.size = size;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public String getModel() {
        return model;
    }

    public void print() {
        System.out.println(model + " " + size);
    }
}