package com.homeWork10Object;

public class Rectangle {
    int a;
    int b;
    int square;
    public void setA(int a1){
        if(a>=0){
            a=a1;
        }else {
            a = 0;
        }
    }

    public int getA() {
        return a;
    }
    public void setB(int b1){
        if(b>=0){
            b=b1;
        }else {
            b = 0;
        }
    }

    public int getB() {
        return b;
    }

    public int getSquare(int a, int b) {
        return a*b;
    }
}
