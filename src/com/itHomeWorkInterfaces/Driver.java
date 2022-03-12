package com.itHomeWorkInterfaces;

public class Driver extends Human implements DriverWork {
    private String carBrand;
    private String routeFrom;
    private String routeTo;


    public Driver(String name, int age, String id, double height, String profession, String carBrand, String routeFrom, String routeTo) {
        super(name, age, id, height, profession);
        this.carBrand = carBrand;
        this.routeFrom = routeFrom;
        this.routeTo = routeTo;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getRouteFrom() {
        return routeFrom;
    }

    public void setRouteFrom(String routeFrom) {
        this.routeFrom = routeFrom;
    }

    public String getRouteTo() {
        return routeTo;
    }

    public void setRouteTo(String routeTo) {
        this.routeTo = routeTo;
    }

    @Override
    public void driveRoute() {
        System.out.println("The driver named " + this.getName() + " works on a route from " + getRouteFrom() + " to " + getRouteTo() + '\n');
    }

    @Override
    public void ruleOver() {
        System.out.println("The driver named " + this.getName() + " rules over his " + getCarBrand() + " car" + '\n');
    }

    @Override
    public String toString() {
        return getName() + " drives " + carBrand + " on a route from " + routeFrom + " to " + routeTo + '\n';
    }
}
