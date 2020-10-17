package com.vivek.leetcode;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(" Result = " + twoSum(new int[] {2, 7, 12, 20}, 9));
    }

    public static int[] twoSum(int[] nums, int target) {
        final int[] result = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }
}
