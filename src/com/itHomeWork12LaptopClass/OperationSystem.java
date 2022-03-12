package com.itHomeWork12LaptopClass;

public class OperationSystem {

    String brand;
    String version;
    int yearOfRelease;


    public OperationSystem(String brand,
                           String version,
                           int yearOfRelease) {
        this.brand = brand;
        this.version = version;
        this.yearOfRelease = yearOfRelease;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getBrand() {
        return brand;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public String getVersion() {
        return version;
    }

    public void print() {
        System.out.println(brand + "" + version + " " + yearOfRelease);
    }

}