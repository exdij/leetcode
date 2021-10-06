package com.company.leetcode.top_interview_questions.strings;

import java.util.Arrays;

public class ReverseString {
    public static void runExamples() {
        char[] in1 = {'h','e','l','l','o'};
        char[] out1 = {'o','l','l','e','h'};

        char[] in2 = {'H','a','n','n','a','h'};
        char[] out2 = {'h','a','n','n','a','H'};

        reverseString(in1);
        reverseString(in2);

        boolean ex1 = Arrays.equals(in1, out1);
        boolean ex2 = Arrays.equals(in2, out2);
        System.out.println(ex1);
        System.out.println(ex2);
    }

    public static void reverseString(char[] s) {
        int ii = 0;
        int jj = s.length - 1;

        while(true) {
            if(ii == jj || ii > jj) {
                return;
            }
            char p = s[jj];
            s[jj] = s[ii];
            s[ii] = p;
            ii++;
            jj--;
        }
    }
}
