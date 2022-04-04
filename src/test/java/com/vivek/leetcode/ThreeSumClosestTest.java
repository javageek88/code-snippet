package com.vivek.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class ThreeSumClosestTest {

    private static final ThreeSumClosest threeSumClosest = new ThreeSumClosest();

    @Test
    public void testArray_1(){
        int[] nums = new int[]{-1,2,1,-4};
        int target = 1;
        int res = threeSumClosest.findClosest(nums, target);
        Assert.assertEquals(2, res);
    }
}
