package com.company.leetcode.top_interview_questions.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SingleNumber {
    public static void runExamples() {
        int[] nums1 = {2,2,1};
        int output1 = 1;

        int[] nums2 = {4,1,2,1,2};
        int output2 = 4;


        int[] nums3 = {1};
        int output3 = 1;

        int[] nums4 = {2,2,1};
        int output4 = 1;


        boolean ex1 = singleNumber(nums1) == output1;
        boolean ex2 = singleNumber(nums2) == output2;
        boolean ex3 = singleNumber(nums3) == output3;
        boolean ex4 = singleNumber(nums4) == output4;

        System.out.println("Example1: " + ex1);
        System.out.println("Example2: " + ex2);
        System.out.println("Example3: " + ex3);
        System.out.println("Example4: " + ex4);
    }

    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        boolean gotFirst = false;
        for(int i = 0; i < nums.length; i++) {
            if(!gotFirst) {
                gotFirst = true;
            } else {
                if(nums[i-1] != nums[i]) {
                    return nums[i-1];
                } else {
                    gotFirst = false;
                }
            }
        }
        return nums[nums.length-1];
    }
}
