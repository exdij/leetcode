package com.company.leetcode.top_interview_questions.array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MoveZeroes {
    public static void runExamples() {
        int[] nums1 = {0,1,0,3,12};
        int[] output1 = {1,3,12,0,0};

        int[] nums2 = {0};
        int[] output2 = {0};

        int[] nums3 = {0,0};
        int[] output3 = {0,0};

        int[] nums4 = {0,0,0,0,0,0,0,0};
        int[] output4 = {0,0,0,0,0,0,0,0};

        int[] nums5 = {0,1,0};
        int[] output5 = {1,0,0};

        moveZeroes(nums1);
        moveZeroes(nums2);
        moveZeroes(nums3);
        moveZeroes(nums4);
        moveZeroes(nums5);
        boolean ex1 = Arrays.equals(nums1,output1);
        boolean ex2 = Arrays.equals(nums2,output2);
        boolean ex3 = Arrays.equals(nums3,output3);
        boolean ex4 = Arrays.equals(nums4,output4);
        boolean ex5 = Arrays.equals(nums5,output5);

        System.out.println("Example1: " + ex1);
        System.out.println("Example2: " + ex2);
        System.out.println("Example3: " + ex3);
        System.out.println("Example4: " + ex4);
        System.out.println("Example5: " + ex5);
    }
    public static void moveZeroes1(int[] nums) {
        int len = nums.length;
        if(len == 1) {
            return;
        }
        int i = 0, c = 0;
        while(true) {
            if(i == len) {
                int[] zeroes = new int[len];
                System.arraycopy(zeroes,0,nums,len-c,c);
                break;
            }
            if(nums[i] == 0) {
                c++;
                System.arraycopy(nums,i+1,nums,i,len-i-1);
                if(nums[i] == 0) {
                    i++;
                }
            } else {
                i++;
            }
        }
    }

    public static void moveZeroes(int[] nums) {
        int len = nums.length;
        if(len == 0) {
            return;
        }
        int ii = 0, jj = 0;
        while(true) {
            if(jj == len) {
                if(ii == len) {
                    break;
                }
                nums[ii] = 0;
                ii++;
                continue;
            }
            if (nums[jj] != 0) {
                nums[ii] = nums[jj];
                ii++;
            }
            jj++;
        }
    }
}
