package com.cellphone;

public class Main {
    public static void main(String[] args) {
        MegaCom smsMega = new MegaCom(0553612307,"Privet","HomeLine",0553072361);
        System.out.println(smsMega);
        O smsO = new O(0553612307,"Privet","HomeLine",0553612307,10.3, 09.5,10.8,12.5,0.58);
        System.out.println(smsO);
    }
}
