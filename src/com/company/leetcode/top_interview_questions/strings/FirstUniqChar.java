package com.company.leetcode.top_interview_questions.strings;

import java.util.*;

public class FirstUniqChar {
    public static void runExamples() {
        String s1 = "leetcode";
        int y1 = 0;

        String s2 = "loveleetcode";
        int y2 = 2;

        String s3 = "aabb";
        int y3 = -1;


        boolean ex1 = firstUniqChar(s1) == y1;
        boolean ex2 = firstUniqChar(s2) == y2;
        boolean ex3 = firstUniqChar(s3) == y3;

        System.out.println("Example 1: " + ex1);
        System.out.println("Example 2: " + ex2);
        System.out.println("Example 3: " + ex3);
    }
    public static int firstUniqChar(String s) {
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])) {
                treeSet.remove(map.get(arr[i]));
            } else {
                treeSet.add(i);
                map.put(arr[i], i);
            }
        }
        if(!treeSet.isEmpty()) {
            return treeSet.first();
        }

        return -1;
    }
}
