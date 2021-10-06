package com.company.leetcode.top_interview_questions.strings;

public class ReverseInteger {
    public static void runExamples() {
        int x1 = 123;
        int y1 = 321;

        int x2 = -123;
        int y2 = -321;

        int x3 = 120;
        int y3 = 21;

        int x4 = 0;
        int y4 = 0;

        boolean ex1 = reverse(x1) == y1;
        boolean ex2 = reverse(x2) == y2;
        boolean ex3 = reverse(x3) == y3;
        boolean ex4 = reverse(x4) == y4;

        System.out.println("Example 1: " + ex1);
        System.out.println("Example 2: " + ex2);
        System.out.println("Example 3: " + ex3);
        System.out.println("Example 4: " + ex4);
    }
    public static int reverse(int x) {
        return 1;
    }
}
