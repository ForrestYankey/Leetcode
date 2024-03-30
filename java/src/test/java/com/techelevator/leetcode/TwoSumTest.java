package com.techelevator.leetcode;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    private TwoSum twoSum = new TwoSum();

    @Test
    public void testTwoSum_GivenArrayOfTwoNumbersAndTarget_Returns0And1() {
        int[] nums = new int[]{1, 2};
        int[] expectedNums = new int[]{0, 1};
        int target = 3;

        int[] results = twoSum.twoSum(nums, target);

        assertArrayEquals(results, expectedNums);
    }

    @Test
    @Disabled
    public void testTwoSum_GivenArrayOfThreeNumbersAndTarget_ReturnTwoNumbersThatEqualTarget() {
        int[] nums = new int[]{1, 2, 3};
        int[] expectedNums = new int[]{0, 1};
        int target = 3;

        int[] results = twoSum.twoSum(nums, target);

        assertArrayEquals(results, expectedNums);
    }
}