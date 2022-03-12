package com.itHomeWork20DogFinal;

public class Pitbul extends Dog {
    private String fur;

    public Pitbul(String fur) {
        super("Rick", 4.23f);
        this.fur = fur;
    }

    public void setFur(String fur) {
        this.fur = fur;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setWeight(float weight) {
        super.setWeight(weight);
    }

    public String getFur() {
        return fur;
    }

    @Override
    public float getWeight() {
        return super.getWeight();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String toString() {
        return "Pitbul{" +
                "fur='" + fur + '\'' +
                '}';
    }
}