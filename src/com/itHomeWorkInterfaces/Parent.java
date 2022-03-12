package com.itHomeWorkInterfaces;

public class Parent extends Human implements Rule, ParentWork {
    private int children;

    public Parent(String name, int age, String id, double height, String profession, int children) {
        super(name, age, id, height, profession);
        this.children = children;
        earnMoney();
        childCare();
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    @Override
    public void ruleOver() {
        if (this.children < 2) {
            System.out.println(this.getName() + " as parent rules over her child" + '\n');
        } else System.out.println(this.getName() + " as parent rules over her children" + '\n');
    }

    @Override
    public String toString() {
        return "Parent " + this.getName() + " has "
                + children + " children" + '\n';
    }
}
