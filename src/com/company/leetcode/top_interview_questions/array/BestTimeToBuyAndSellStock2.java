package com.company.leetcode.top_interview_questions.array;

import java.util.Objects;

public class BestTimeToBuyAndSellStock2 {

    public static void runExamples() {
        int[] prices1 = {7,1,5,3,6,4};
        int[] prices2 = {1,2,3,4,5};
        int[] prices3 = {7,6,4,3,1};

        if(BestTimeToBuyAndSellStock2.getProfit(prices1) == 7) {
            System.out.println("Example 1: " + true);
        }
        if(BestTimeToBuyAndSellStock2.getProfit(prices2) == 4) {
            System.out.println("Example 2: " + true);
        }
        if(BestTimeToBuyAndSellStock2.getProfit(prices3) == 0) {
            System.out.println("Example 3: " + true);

        }
    }

    public static int getProfit(int[] prices){
        int sum = 0;
        int len = prices.length;
        boolean haveStock = false;
        int sP = 0;
        if(len < 2){
            return 0;
        }

        for (int i = 1; i < len; i++) {
            if(haveStock) {
                if(prices[i] < prices[i-1]) {
                    sum += prices[i-1] - sP;
                    haveStock = false;
                }
            }

            if(!haveStock) {
                if(prices[i] > prices[i-1]) {
                    haveStock = true;
                    sP = prices[i-1];
                }
            }
        }
        if(haveStock) {
            sum += prices[len - 1] - sP;
        }
        return sum;
    }
}
