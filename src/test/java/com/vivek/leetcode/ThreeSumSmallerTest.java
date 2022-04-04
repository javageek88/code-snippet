package com.vivek.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class ThreeSumSmallerTest {

    private static final ThreeSumSmall threeSumSmall = new ThreeSumSmall();

    @Test
    public void testArray_1(){
        int[] nums = new int[]{-2,0,1,3};
        int target = 2;
        int res = threeSumSmall.threeSumSmaller(nums, target);
        Assert.assertEquals(2, res);
    }

}
