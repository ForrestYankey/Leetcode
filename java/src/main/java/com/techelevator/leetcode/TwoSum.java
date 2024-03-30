package com.techelevator.leetcode;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers
 * such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the
 * same element twice.
 *
 * You can return the answer in any order.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] twoNums = new int[2];
        int counter = 0;

        for (int i = 0; i < nums.length; i++) {

                int currentNum = nums[i];
                twoNums[counter] = i;
                counter++;
        }
        return twoNums;
    }
}
