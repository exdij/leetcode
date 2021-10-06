package com.company.leetcode.top_interview_questions.array;

import java.util.Arrays;

public class ValidSudoku {
    public static void runExamples() {
        char[][] board1 = {{'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}};
        boolean output1 = true;

        char[][] board2 = {{'8','3','.','.','7','.','.','.','.'}
                ,{'6','.','.','1','9','5','.','.','.'}
                ,{'.','9','8','.','.','.','.','6','.'}
                ,{'8','.','.','.','6','.','.','.','3'}
                ,{'4','.','.','8','.','3','.','.','1'}
                ,{'7','.','.','.','2','.','.','.','6'}
                ,{'.','6','.','.','.','.','2','8','.'}
                ,{'.','.','.','4','1','9','.','.','5'}
                ,{'.','.','.','.','8','.','.','7','9'}};
        boolean output2 = false;

        boolean ex1 = validSudoku(board1) == output1;
        boolean ex2 = validSudoku(board2) == output2;

        System.out.println("Example1: " + ex1);
        System.out.println("Example2: " + ex2);
    }

    public static boolean validSudoku(char[][] board) {
        for(int ii = 0; ii < 9; ii++) {
            int[] col = new int[9];
            int[] row = new int[9];

            for(int jj = 0; jj < 9; jj++) {
                if(board[ii][jj] != '.') {
                    int t = Character.getNumericValue(board[ii][jj]) - 1;
                    if(row[t] == 0) {
                        row[t] = 1;
                    } else {
                        return false;
                    }
                }
                if(board[jj][ii] != '.') {
                    int t = Character.getNumericValue(board[jj][ii]) - 1;
                    if(col[t] == 0) {
                        col[t] = 1;
                    } else {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
