package com.vivek.leetcode;

import java.util.Arrays;

public class ThreeSumSmall {

    public int threeSumSmaller(int[] nums, int target) {
        //iterate over numbers
        //binary search
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i< nums.length; i++){
            sum += twoSumSmaller(nums, i + 1, target - nums[i]);
        }
        return sum;
    }

    private int twoSumSmaller(int[] nums, int startIndex, int target) {
        int left = startIndex;
        int right = nums.length - 1;
        int sum = 0;
        while(left < right){
            if(nums[left] + nums[right] < target){
                sum += right - left;
                ++left;
            }else{
                --right;
            }
        }
        return sum;
    }
}
