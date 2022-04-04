package com.vivek.leetcode;

import java.util.Arrays;

public class MissingNumber {

    /**
     * With Gauss Theorem sum = n * (n + 1) /2
     * @param nums
     * @return
     */
    public int findMissingNumber(int[] nums) {
        int expectedSum = nums.length * (nums.length + 1)/2;
        int actualSum = Arrays.stream(nums).sum();
        return expectedSum - actualSum;
    }
}
