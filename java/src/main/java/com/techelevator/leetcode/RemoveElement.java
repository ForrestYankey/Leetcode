package com.techelevator.leetcode;

public class RemoveElement {
    /**
     * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the
     * elements may be changed. Then return the number of elements in nums which are not equal to val.
     *
     * Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the
     * following things:
     *
     * - Change the array nums such that the first k elements of nums contain the elements which are not equal to val.
     *   The remaining elements of nums are not important as well as the size of nums.
     * - Return k.
     */

    public int removeElement(int[] nums, int val) {
        // make a place holder for equal values
        int equalValues = 0;
        int k = 0;

        //loop through the nums array
        for (int i = 0; i < nums.length; i++) {
            //if val is equal to nums[i], nums[equalValues] = val
            if (nums[i] != val) {
                nums[equalValues] = nums[i];
                //increment equalValues
                equalValues++;
                //incremtn k
                k++;
            }
        }
        // return k, nums
        return k;
    }
}
