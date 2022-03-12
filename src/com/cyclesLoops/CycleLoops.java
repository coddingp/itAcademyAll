package com.cyclesLoops;

public class CycleLoops {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10) {
            System.out.println("Привет");
            count++;
        }
        int a = 1;
        int b = 11;
        do {
            System.out.println("a > b ???");
        } while (a > b);
    }
}