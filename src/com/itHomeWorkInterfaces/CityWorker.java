package com.itHomeWorkInterfaces;

import java.util.Objects;

public class CityWorker extends Human implements CityWorkerJob {
    public static String task;

    public CityWorker(String name, int age, String id, double height, String profession, String task) {
        super(name, age, id, height, profession);
    }

    public static void doJob() {
        if (Objects.equals(task, "Go and build a road.")) {
            System.out.println("Roger That!\n");
        } else System.out.println("I am already fixing it!\n");
    }
}
