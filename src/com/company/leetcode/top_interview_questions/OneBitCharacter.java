package com.company.leetcode.top_interview_questions;

public class OneBitCharacter {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        int len = bits.length;
        while(true) {
            if(bits[i] == 0) {
                if(i + 1 == len) {
                    return true;
                }
                i++;
            } else {
                if(i + 2 == len) {
                    return false;
                }
                i += 2;
            }
        }
    }
}
