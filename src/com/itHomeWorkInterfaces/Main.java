package com.itHomeWorkInterfaces;


public class Main {
    public static void main(String[] args) {

        Mayor mayor = new Mayor("Karimov", 52, "ID15623402", 169, "Mayor", "Kara-Balta", 2);

        String task = mayor.fixTrafficLight();
        CityWorker cityWorker = new CityWorker("Randy", 32, "ID26543", 153, "city worker", "Go and build a road.");
        mayor.buildRoad();
        System.out.println(mayor);

//        Parent parent = new Parent("Tatian", 42, "ID156252" , 172, "Mayor assistant", 2);
////
//        parent.ruleOver();
//        System.out.println(parent.toString());
//
//        Driver driver = new Driver("Bob",25, "Dc1235402", 182, "Driver","Toyota", "Kara-Balta","Bishkek");
//        driver.ruleOver();
//        System.out.println(driver.toString());


//        System.out.println(mayor instanceof Mayor);
    }
}

