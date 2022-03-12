package com.itHomeWorkInterfaces;

public abstract class Human {
    private String name;
    private int age;
    private String id;
    private double height;
    private String profession;

    public Human(String name, int age, String id, double height, String profession) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.height = height;
        this.profession = profession;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", height=" + height +
                ", profession='" + profession + '\'' +
                '}' + '\n';
    }
}
