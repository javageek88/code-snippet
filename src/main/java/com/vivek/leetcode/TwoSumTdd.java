package com.vivek.leetcode;

import java.util.HashSet;
import java.util.Set;

public class TwoSumTdd {

    /*public int[] findTwoSum(int[] array, int target) {
        if(array == null) return new int[0];
        for(int i=0; i<array.length - 1; i++){
            int firstNum = array[i];
            for(int j = i+1; j< array.length; j++){
                int secondNum = array[j];
                if(firstNum + secondNum == target){
                    return new int[]{firstNum, secondNum};
                }
            }
        }
        return new int[0];
        //O(n2)
    }*/
    //5,4,3 = 7
    public int[] findTwoSum(int[] array, int target) {
        if(array == null) return new int[0];
        Set<Integer> mapping = new HashSet<>();
        int left = 0;
        int right = array.length - 1;
        while(left <= right){
            int potentialMatch = target - array[left];
            if(mapping.contains(potentialMatch)){
                return new int[]{potentialMatch, array[left]};
            }
            mapping.add(array[left]);
            left++;
        }
        return new int[0];
        //O(n)
    }
}
