package com.techelevator.leetcode;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers
 * such that they add up to target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the
 * same element twice.
 * <p>
 * You can return the answer in any order.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (currentNum + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {}; // No solution found
    }
}
