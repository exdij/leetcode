package com.company.leetcode.top_interview_questions.strings;

public class Atoi {
    public static void runExamples() {
        String s1 = "42";
        int r1 = 42;

        String s2 = "   -42";
        int r2 = -42;

        String s3 = "4193 with words";
        int r3 = 4193;

        String s4 = "words and 987";
        int r4 = 0;

        String s5 = "-91283472332";
        int r5 = -2147483648;

        String s6 = "-9283472332";
        int r6 = -2147483648;

        String s7 = "-+12";
        int r7 = 0;

        String s8 = "  0000000000012345678";
        int r8 = 12345678;

        String s9 = "00000-42a1234";
        int r9 = 0;

        boolean ex1 = myAtoi(s1) == r1;
        boolean ex2 = myAtoi(s2) == r2;
        boolean ex3 = myAtoi(s3) == r3;
        boolean ex4 = myAtoi(s4) == r4;
        boolean ex5 = myAtoi(s5) == r5;
        boolean ex6 = myAtoi(s6) == r6;
        boolean ex7 = myAtoi(s7) == r7;
        boolean ex8 = myAtoi(s8) == r8;
        boolean ex9 = myAtoi(s9) == r9;

        System.out.println("Example 1: " + ex1);
        System.out.println("Example 2: " + ex2);
        System.out.println("Example 3: " + ex3);
        System.out.println("Example 4: " + ex4);
        System.out.println("Example 5: " + ex5);
        System.out.println("Example 6: " + ex6);
        System.out.println("Example 7: " + ex7);
        System.out.println("Example 8: " + ex8);
        System.out.println("Example 9: " + ex9);
    }

    public static int myAtoi(String s) {
        char[] c = s.toCharArray();
        int i = 0, iLen = 0, iStart = -1, iEnd = -1, sum = 0;
        int len = c.length;
        int sign = 1;

        while(true) {
            if(i == len || c[i] != ' ') {
                break;
            }
            i++;
        }

        if(i == len) {
            return 0;
        }
        if(c[i] == '-') {
            sign = -1;
            i++;
        } else if(c[i] == '+') {
            i++;
        }
        if(i == len) {
            return 0;
        }
        if(!Character.isDigit(c[i])) {
            return 0;
        }
        while(true) {
            if(c[i] != '0') {
                break;
            }
            i++;
        }

        iStart = i;
        iLen++;
        i++;
        while(true) {
            if(i >= len) {
                break;
            }
            if(!Character.isDigit(c[i])) {
                int z = i + 1;
                while(true) {
                    if(z == len) {
                        i = len - 1;
                        break;
                    }
                    if(Character.isDigit(c[z])) {
                        return 0;
                    }
                    z++;
                }
            }
            if(i >= len) {
                break;
            }
            iEnd = i;
            iLen++;
            i++;
        }
        if(iLen > 10) {
            if(sign == -1) {
                return -2147483648;
            } else {
                return 2147483647;
            }
        }

        if(iLen == 10) {
            int firstNum = Character.getNumericValue(c[iStart+iLen - 1]);
            iLen--;
            int m = 1;
            while(true) {
                if(iLen == 0) {
                    if(sign == 1) {
                        if(sum > 214748364 || (sum == 214748364 && firstNum >= 7)) {
                            return 2147483647;
                        } else {
                            return sum * 10 + firstNum;
                        }
                    } else {
                        if(sum > 214748364 || (sum == 214748364 && firstNum >= 8)) {
                            return -2147483648;
                        } else {
                            return (sum * 10 + firstNum) * -1;
                        }
                    }
                }
                sum += Character.getNumericValue(c[iStart+iLen - 1]) * m;
                iLen--;
                m = m*10;
            }
        }

        int m = 1;
        while(true) {
            if(iLen == 0) {
                return sign * sum;
            }
            sum += Character.getNumericValue(c[iStart+iLen - 1]) * m;
            iLen--;
            m = m*10;
        }
    }

}
