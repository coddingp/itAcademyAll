package com.breakInLoops;

public class BreakInLoops {
    public static void main(String[] args) {
        int nX = -1;
        int N = 10;
        int X = 2;
        int[] A = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < N; i++) {
            if (A[i] == X) {
                nX = i;
                break;
            }
            if (nX >= 0) {
                System.out.println("A[" + nX + "] = " + X);
            } else System.out.println("Не нашли!");
        }
    }
}
