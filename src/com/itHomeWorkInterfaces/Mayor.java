package com.itHomeWorkInterfaces;

import static com.itHomeWorkInterfaces.CityWorker.doJob;

public class Mayor extends Human implements MayorWork, Rule {
    private String city;
    private int yearRules;

    public Mayor(String name, int age, String id, double height, String profession, String city, int yearRules) {
        super(name, age, id, height, profession);
        this.city = city;
        this.yearRules = yearRules;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getRuleYear() {
        return yearRules;
    }

    public void setRuleYear(int ruleYear) {
        this.yearRules = ruleYear;
    }

    @Override
    public void buildRoad() {
        System.out.println("Go and build a road.\n");
        doJob();
    }

    @Override
    public String fixTrafficLight() {
        System.out.println("Go and fix!\n");
        doJob();
        return null;
    }

    @Override
    public String toString() {
        return "Mayor{" +
                "city='" + city + '\'' +
                ", yearRules=" + yearRules +
                '}' + '\n';
    }

    @Override
    public void ruleOver() {
        System.out.println("Mayor rules over " + this.city + " city" + '\n');
    }
}
