package com.company.leetcode.neetcode.arrayshashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ValidAnagram {
  public static void run() {
    System.out.println("ex1: " + (isAnagram("anagram", "nagaram")));
    System.out.println("ex2: " + (!isAnagram("rat", "car")));
    System.out.println("ex3: " + (!isAnagram("aacc", "ccac")));
  }


  public static boolean isAnagram(String s, String t) {
    if(s.length() != t.length()) {
      return false;
    }

    char[] sArr = s.toCharArray();
    char[] tArr = t.toCharArray();
    Map<Character, Integer> sMap = new HashMap<>();
    for (char c : sArr) {
      if(sMap.containsKey(c)) {
        sMap.computeIfPresent(c, (k,v) -> v + 1);
      } else {
        sMap.put(c, 1);
      }
    }

    System.gc();

    for (char c : tArr) {
      if(!sMap.containsKey(c)) {
        System.gc();
        return false;
      }
      Integer v = sMap.get(c);
      v -= 1;
      if(v < 0) {
        System.gc();
        return false;
      }
      sMap.put(c,v);
    }

    System.gc();
    return true;
  }
}
