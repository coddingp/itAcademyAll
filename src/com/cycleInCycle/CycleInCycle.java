package com.cycleInCycle;

import java.util.Arrays;
import java.util.Random;

public class CycleInCycle {

    public static void main(String[] args) {
        int N = 5;
        int M = 5;
        int[][] A = new int[5][5];
        A[0][0] = 0;
        A[0][1] = 1;
        A[1][0] = 2;
        A[2][4] = 3;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                Random random = new Random();
                A[i][j] = random.nextInt(10);
                System.out.print(Arrays.toString(A[i]) + " ");
            }
            System.out.println();
        }
    }
}
