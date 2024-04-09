package com.techelevator.leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
//        String nums = String.valueOf(x);
//        ArrayList<String> numsArray = new ArrayList<>();
//        int n = nums.length();
//
//        for (int i = 0; i < n; i++) {
//            numsArray.add(String.valueOf(nums.charAt(i)));
//        }
//        //check if palindrome
//        for (int i = 0; i < n; i++) {
//            String currentNum = numsArray.get(i);
//            String pointer = numsArray.get((n-1) - i);
//            if (!currentNum.equals(pointer)) {
//                return false;
//            }
//        }
//        return true;


        //Reversing the entire number
        if (x < 0) { //check for negative
            return false;
        }

        long reversed = 0; //where we store the reversed value of x
        long temp = x; //placeholder to manipulate the input num without modifying the original value

        while (temp != 0) {
            int digit = (int) (temp % 10);
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        return (reversed == x);
    }
}
