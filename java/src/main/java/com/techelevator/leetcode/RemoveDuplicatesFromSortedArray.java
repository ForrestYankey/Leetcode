package com.techelevator.leetcode;

public class RemoveDuplicatesFromSortedArray {

    /**
     * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique
     * element appears only once. The relative order of the elements should be kept the same. Then return the number of
     * unique elements in nums.
     *
     * Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
     *
     *  - Change the array nums such that the first k elements of nums contain the unique elements in the order they
     *    were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
     *  - Return k.
     */

    public int removeDuplicates(int[] nums) {
        //unique elements
        int k = 1;

        //loop through nums, skip the first one
        for (int i = 1; i < nums.length; i++) {

            //check if nums[unique] is different than nums[i]
            if (nums[i] != nums[i - 1]) {
                //if it is, nums[unique] = nums[i]
                nums[k] = nums[i];
                //increment k
                k++;
            }
        }
        return k;
    }
}
