package com.company.leetcode.top_interview_questions.array;

import java.util.Arrays;

public class RotateArray {

    public static void runExamples() {
        int[] nums1 = {1,2,3,4,5,6,7};
        int k1 = 3;
        int[] output1 = {5,6,7,1,2,3,4};

        int[] nums2 = {-1,-100,3,99};
        int k2 = 2;
        int[] output2 = {3,99,-1,-100};

        int[] nums3 = {-1,-100,3,99};
        int k3 = 4*4;
        int[] output3 = {-1,-100,3,99};


        int[] nums4 = {1,2,3};
        int k4 = 2;
        int[] output4 = {2,3,1};

        boolean ex1 = Arrays.equals(rotate(nums1, k1), output1);
        boolean ex2 = Arrays.equals(rotate(nums2, k2), output2);
        boolean ex3 = Arrays.equals(rotate(nums3, k3), output3);
        boolean ex4 = Arrays.equals(rotate(nums4, k4), output4);

        System.out.println("Example1: " + ex1);
        System.out.println("Example2: " + ex2);
        System.out.println("Example3: " + ex3);
        System.out.println("Example4: " + ex4);
    }

    public static int[] rotate(int[] nums, int k) {
        int len = nums.length;
        int rk = k%len;
        if(rk == 0) {
            return nums;
        }
        int[] placeHolder = Arrays.copyOf(nums, len);

        System.arraycopy(placeHolder, len-rk, nums, 0, rk);
        System.arraycopy(placeHolder, 0, nums, rk, len-rk);

        return nums;
    }
}
