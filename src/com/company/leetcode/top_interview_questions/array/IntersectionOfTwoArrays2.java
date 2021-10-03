package com.company.leetcode.top_interview_questions.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArrays2 {
    public static void runExamples() {
        int[] nums11 = {1,2,2,1};
        int[] nums12 = {2,2};
        int[] output1 = {2,2};

        int[] nums21 = {4,9,5};
        int[] nums22 = {9,4,9,8,4};
        int[] output2 = {4,9};


        boolean ex1 = Arrays.equals(intersect(nums11, nums12), output1);
        boolean ex2 = Arrays.equals(intersect(nums21, nums22), output2);

        System.out.println("Example1: " + ex1);
        System.out.println("Example2: " + ex2);
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] retVal = new int[len1];

        int ii = 0;
        int jj = 0;
        int c = 0;
        while(true) {
            if(nums1[ii] == nums2[jj]) {
                retVal[c] = nums1[ii];
                c++;
                if(ii+ 1 == len1 || jj + 1 == len2) {
                    break;
                }
                ii++;
                jj++;
            } else if(nums1[ii] > nums2[jj]) {
                if(jj + 1 == len2) {
                    break;
                }
                jj++;
            } else {
                if(ii + 1 == len1) {
                    break;
                }
                ii++;
            }
        }
        return Arrays.copyOfRange(retVal, 0 ,c);
    }
}
