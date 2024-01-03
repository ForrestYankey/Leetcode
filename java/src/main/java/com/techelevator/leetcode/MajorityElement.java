package com.techelevator.leetcode;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int majority = 0;
        for (int i = 0; i < n; i++){
            int currentNum = nums[i];
            int count = 0;
            for (int num : nums) {
                if (num == currentNum) {
                    count++;
                }
            }
            if(count > n/2) {
                majority = currentNum;
                break;
            }
        }
        return majority;
    }
}
