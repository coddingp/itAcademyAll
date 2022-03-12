package com.itHomeWorkInterfaces;

public interface ParentWork {
    default void childCare() {
        System.out.println("The parents of the city care of their children well" + '\n');
    }

    default void earnMoney() {
        System.out.println("The parents of the city work really good" + '\n');
    }
}
