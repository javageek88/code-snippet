package com.vivek.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {

    @Test
    public void nonEmptyArrayInput(){
        TwoSumTdd twoSum = new TwoSumTdd();
        int[] result = twoSum.findTwoSum(null, 0);
        Assert.assertEquals(0, result.length);
    }

    @Test
    public void targetSumWithTwoArrayElements(){
        TwoSumTdd twoSum = new TwoSumTdd();
        int[] result = twoSum.findTwoSum(new int[]{5,4}, 9);
        Assert.assertEquals(2, result.length);
    }

    @Test
    public void targetSumWithThreeArrayElements(){
        TwoSumTdd twoSum = new TwoSumTdd();
        int[] result = twoSum.findTwoSum(new int[]{5,4, 3}, 7);
        Assert.assertEquals(2, result.length);
    }

    @Test
    public void targetSumWithFiveArrayElements(){
        TwoSumTdd twoSum = new TwoSumTdd();
        int[] result = twoSum.findTwoSum(new int[]{5,4, 3, -1, 2}, 2);
        Assert.assertEquals(2, result.length);
    }

    @Test
    public void targetSumWithNoValidTarget(){
        TwoSumTdd twoSum = new TwoSumTdd();
        int[] result = twoSum.findTwoSum(new int[]{5,4, 3, -1, 2}, -1);
        Assert.assertEquals(0, result.length);
    }

    @Test
    public void targetSumWithLargeDateSet(){
        TwoSumTdd twoSum = new TwoSumTdd();
        int[] result = twoSum.findTwoSum(new int[]{3, 5, -4, 8, 11, 1, -1, 6}, 10);
        Assert.assertEquals(2, result.length);
    }

}
