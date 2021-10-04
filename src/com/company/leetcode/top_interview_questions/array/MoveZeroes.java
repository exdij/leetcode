package com.company.leetcode.top_interview_questions.array;

import java.util.Arrays;

public class MoveZeroes {
    public static void runExamples() {
        int[] nums1 = {0,1,0,3,12};
        int[] output1 = {1,3,12,0,0};

        int[] nums2 = {0};
        int[] output2 = {0};

        boolean ex1 = Arrays.equals(moveZeores(nums1),output1);
        boolean ex2 = Arrays.equals(moveZeores(nums2),output2);

        System.out.println("Example1: " + ex1);
        System.out.println("Example2: " + ex2);
    }
    public static void moveZeores(int[] nums) {

    }
}
