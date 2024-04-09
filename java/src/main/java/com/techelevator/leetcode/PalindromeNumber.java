package com.techelevator.leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String nums = String.valueOf(x);
        ArrayList<String> numsArray = new ArrayList<>();
        int n = nums.length();

        for (int i = 0; i < n; i++) {
            numsArray.add(String.valueOf(nums.charAt(i)));
        }
        //check if palindrome
        for (int i = 0; i < n; i++) {
            String currentNum = numsArray.get(i);
            String pointer = numsArray.get((n-1) - i);
            if (!currentNum.equals(pointer)) {
                return false;
            }
        }
        return true;
    }
}
