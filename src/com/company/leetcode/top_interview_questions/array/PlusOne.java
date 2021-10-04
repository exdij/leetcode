package com.company.leetcode.top_interview_questions.array;

import java.util.Arrays;

public class PlusOne {
    public static void runExamples() {
        int[] nums1 = {1,2,3};
        int[] output1 = {1,2,4};

        int[] nums2 = {4,3,2,1};
        int[] output2 = {4,3,2,2};

        int[] nums3 = {0};
        int[] output3 = {1};

        int[] nums4 = {9};
        int[] output4 = {1,0};

        boolean ex1 = Arrays.equals(plusOne(nums1),output1);
        boolean ex2 = Arrays.equals(plusOne(nums2),output2);
        boolean ex3 = Arrays.equals(plusOne(nums3),output3);
        boolean ex4 = Arrays.equals(plusOne(nums4),output4);

        System.out.println("Example1: " + ex1);
        System.out.println("Example2: " + ex2);
        System.out.println("Example3: " + ex3);
        System.out.println("Example4: " + ex4);
    }

    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        return addToIndex(digits, len - 1);
    }

    private static int[] addToIndex(int[] digits, int i) {
        if((digits[i] += 1) == 10) {
            digits[i] = 0;
            if(i != 0) {
                return addToIndex(digits, i - 1);
            } else {
                int[] newDigits = new int[digits.length + 1];
                newDigits[0] = 1;
                System.arraycopy(digits, 0,newDigits, 1, digits.length);
                return newDigits;
            }
        }
        return digits;
    }
}
