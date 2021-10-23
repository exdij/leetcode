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

        int x5 = +123;
        int y5 = 321;

        int x6 = 1534236469;
        int y6 = 0;

        boolean ex1 = reverse(x1) == y1;
        boolean ex2 = reverse(x2) == y2;
        boolean ex3 = reverse(x3) == y3;
        boolean ex4 = reverse(x4) == y4;
        boolean ex5 = reverse(x5) == y5;
        boolean ex6 = reverse(x6) == y6;

        System.out.println("Example 1: " + ex1);
        System.out.println("Example 2: " + ex2);
        System.out.println("Example 3: " + ex3);
        System.out.println("Example 4: " + ex4);
        System.out.println("Example 5: " + ex5);
        System.out.println("Example 6: " + ex6);
    }
    public static int reverse(int x) {
        int maxInt = Integer.MAX_VALUE;
        boolean negative = false;
        char[] arrD = Integer.toString(x).toCharArray();
        char[] arr;
        if(arrD.length > 0) {
            if(arrD[0] == '-') {
                negative = true;
                arr = new char[arrD.length - 1];
                System.arraycopy(arrD,1,arr,0,arrD.length - 1);
            } else if(arrD[0] == '+') {
                negative = false;
                arr = new char[arrD.length - 1];
                System.arraycopy(arrD,1,arr,0,arrD.length - 1);
            } else {
                arr = new char[arrD.length];
                arr = arrD.clone();
            }
        } else {
            return x;
        }
        if(arr.length == 10 && Character.getNumericValue(arr[9]) > 2) {
            return 0;
        }

        int r = arr.length - 1;
        int l = 0;
        while(true) {
            if(l>=r) {
                break;
            }
            char p = arr[r];
            arr[r] = arr[l];
            arr[l] = p;
            l++;
            r--;
        }
        int m = (int)Math.pow(10,(arr.length - 1));
        int ret = 0;
        boolean zero = true;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != '0') {
                zero = false;
            }
            if(!zero) {
                 int a = Character.getNumericValue(arr[i]) * m;

                if(maxInt - ret < a) {
                    return 0;
                }
                    ret += a;
            }
            m /= 10;
        }
        if(negative) {
            ret *= -1;
        }
        return ret;
    }
}
