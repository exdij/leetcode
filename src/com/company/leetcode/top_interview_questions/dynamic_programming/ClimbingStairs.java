package com.company.leetcode.top_interview_questions.dynamic_programming;

public class ClimbingStairs {
    public static void runExamples() {
        int s1 = 2;
        int r1 = 2;

        int s2 = 3;
        int r2 = 3;

        int s3 = 4;
        int r3 = 5;

        int s4 = 5;
        int r4 = 8;

        int s5 = 49;
        int r5 = Integer.MAX_VALUE;

        boolean ex1 = run(s1) == r1;
        boolean ex2 = run(s2) == r2;
        boolean ex3 = run(s3) == r3;
        boolean ex4 = run(s4) == r4;
        boolean ex5 = run(s5) == r5;

        System.out.println("Example 1: " + ex1);
        System.out.println("Example 2: " + ex2);
        System.out.println("Example 3: " + ex3);
        System.out.println("Example 4: " + ex4);
        System.out.println("Example 5: " + ex5);
    }

    private static int run(int n) {
        if(n < 4) {
            return n;
        }
        int p = 3;
        int pp = 2;
        int i = 4;
        while(true) {
            int num = pp + p;
            if(i==n) {
                return num;
            }
            pp = p;
            p = num;
            i++;
        }
    }
}
