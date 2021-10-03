package com.company.leetcode.top_interview_questions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        boolean valWasPresent = false;
        String[] listed = s.split(" ");
        if(listed.length != pattern.length()) {
            return false;
        }
        for(int i = 0; i < pattern.length(); i++) {
            if(map.containsValue(listed[i])) {
                valWasPresent = true;
            }
            String test = map.put(pattern.charAt(i), listed[i]);
            if(test == null && valWasPresent) {
                return false;
            } else {
                valWasPresent = false;
            }
            if(test != null && !test.equals(listed[i])) {
                return false;
            }
        }
        return true;
    }
}
