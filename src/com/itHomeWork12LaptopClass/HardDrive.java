package com.itHomeWork12LaptopClass;

public class HardDrive {
    String type;
    double speed;
    double volume;
    String producer;

    public HardDrive(String type,
                     double speed,
                     double volume,
                     String producer) {
        this.type = type;
        this.speed = speed;
        this.volume = volume;
        this.producer = producer;
    }


    public void setType(String type) {
        this.type = type;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getType() {
        return this.type;
    }

    public double getSpeed() {
        return this.speed;
    }

    public String getProducer() {
        return this.producer;
    }

    public double getVolume() {
        return this.volume;
    }

    public void print() {
        System.out.println(getType() + " " + getSpeed() + " " + getProducer() + " " + getVolume());
    }
}