package com.company.leetcode.leetcode75;

import java.util.Arrays;

public class MergeStringAlternately {

  public static void run() {
    System.out.println("ex1: " + mergeAlternately("abc", "pqr").equals("apbqcr"));
    System.out.println("ex2: " + mergeAlternately("ab", "pqrs").equals("apbqrs"));
    System.out.println("ex3: " + mergeAlternately("abcd", "pq").equals("apbqcd"));
  }


  public static String mergeAlternately2(String word1, String word2) {
    int word1l = word1.length();
    int word2l = word2.length();
    char[] word1a = new char[word1l];
    char[] word2a = new char[word2l];
    char[] m = new char[word1l + word2l];
    word1.getChars(0, word1l, word1a, 0);
    word2.getChars(0, word2l, word2a, 0);

    int i = 0;
    int j = 0;

    while(true) {
      if(i < word1l) {
        m[j] = word1a[i];
        j++;
      }

      if(i < word2l) {
        m[j] = word2a[i];
        j++;
      }

      i++;
      if(i >= word1l && i>= word2l) {
        break;
      }
    }

    return String.valueOf(m);
  }

  public static String mergeAlternately(String word1, String word2) {
    int l1 = word1.length();
    int l2 = word2.length();

    StringBuilder sb = new StringBuilder();
    int i = 0;
    while(true) {
      if(i < l1) {
        sb.append(word1.charAt(i));
      }
      if(i < l2) {
        sb.append(word2.charAt(i));
      }
      i++;

      if(i >= l1 && i >= l2) {
        break;
      }
    }

    return sb.toString();
  }
}
