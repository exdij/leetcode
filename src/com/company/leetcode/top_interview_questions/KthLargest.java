package com.company.leetcode.top_interview_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

public class KthLargest {
    List<Integer> list = new ArrayList<>();
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        for(int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
    }
    public int add(int val) {
        list.add(val);
        int c = 0;
        Collections.sort(list, Collections.reverseOrder());
        for(Integer num : list) {
            c++;
            if(c == k) {
                return num;
            }
        }
        return 0;
    }
}
