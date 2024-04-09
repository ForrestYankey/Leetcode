package com.techelevator.leetcode;

import java.util.HashMap;
import java.util.Map;

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
//        for (int i = 0; i < nums.length; i++) {
//            int currentNum = nums[i];
//            for (int j = i + 1; j < nums.length; j++) {
//                if (currentNum + nums[j] == target) {
//                    return new int[] {i, j};
//                }
//            }
//        }
//        return new int[] {}; // No solution found




        //USING HASHMAPS for more efficiency
//        Map<Integer, Integer> numMap = new HashMap<>();
//        int n = nums.length;
//
//        //build the hash table
//        for (int i = 0; i < n; i++) {
//            numMap.put(nums[i], i); //number is the key, placement is the value
//        }
//
//        //find the number that sums to the target, "complement"
//        for (int i = 0; i < n; i++) {
//            int complement = target - nums[i]; //the number that will sum to the target
//            if (numMap.containsKey(complement) && numMap.get(complement) != i) {
//                return new int[] {i, numMap.get(complement)};
//            }
//        }
//
//        return new int[]{}; //no solution found

        //Other option that builds hashmap while checking for complement, this is much faster
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) { //check if it has complement
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i); //if it doesn't, put number in map, then repeat
        }

        return new int[]{}; //no solution found
    }
}
