package com.company.leetcode.neetcode.arrayshashing;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
  public static void run() {
    System.out.println("ex1: " + (containsDuplicate(new int[]{1, 2, 3, 1})));
    System.out.println("ex2: " + (!containsDuplicate(new int[]{1, 2, 3, 4})));
    System.out.println("ex3: " + (containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2})));
  }


  public static boolean containsDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int num : nums) {
      if(!set.add(num)) {
        System.gc();
        return true;
      }

    }
    System.gc();
    return false;
  }
}
