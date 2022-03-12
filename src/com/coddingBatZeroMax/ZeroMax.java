package com.coddingBatZeroMax;

import java.util.Arrays;

public class ZeroMax {

    public static void main(String[] args) {
        // write your code here
        int[] nums = {0, 1, 5};
        System.out.println(Arrays.toString(nums));
        zeroMax(nums);
        System.out.println(Arrays.toString(nums));
    }


    public static int[] zeroMax(int[] nums) {
        int b = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                b++;
            }
        }


        int[] oddNums = new int[b];
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                oddNums[a] = nums[i];
                a++;
            }
        }

        int oddMax = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 0) {
                for (int i = j; i < oddNums.length; i++) {
                    if (oddMax <= oddNums[i]) {
                        oddMax = oddNums[i];
                    }
                }
            }
        }


        for (int i = 0; i < nums.length; i++) {
            if (i + 1 < nums.length) {
                if (nums[i] == 0) {
                    if (nums[i + 1] % 2 != 0) {
                        for (int z = i + 1; z < nums.length; z++) {
                            if (nums[i] < nums[z] && nums[z] % 2 != 0 && nums[z] != 0) {
                                nums[i] = nums[z];
                                i++;
                            }
                        }
                    } else {
                        if (nums[i + 1] % 2 != 0) {
                            nums[i] = nums[i + 1];
                        } else {
                            if (i + 2 < nums.length) {
                                nums[i] = oddMax;
                            } else nums[i] = nums[i];
                        }
                    }
                }
            }
        }
        return nums;
    }
}