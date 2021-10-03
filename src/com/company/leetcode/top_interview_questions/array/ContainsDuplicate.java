package com.company.leetcode.top_interview_questions.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ContainsDuplicate {
    public static void runExamples() {
        int[] nums1 = {1,2,3,1};
        boolean output1 = true;

        int[] nums2 = {1,2,3,4};
        boolean output2 = false;

        int[] nums3 = {1,1,1,3,3,4,3,2,4,2};
        boolean output3 = true;

        boolean ex1 = containsDuplicate(nums1) == output1;
        boolean ex2 = containsDuplicate(nums2) == output2;
        boolean ex3 = containsDuplicate(nums3) == output3;

        System.out.println("Example1: " + ex1);
        System.out.println("Example2: " + ex2);
        System.out.println("Example3: " + ex3);
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if(!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }

}
