package com.vivek.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class MissingNumberTest {

    private static final MissingNumber missingNumber = new MissingNumber();

    @Test
    public void testSum_1(){
        int[] nums = new int[]{0,2};
        int res = missingNumber.findMissingNumber(nums);
        Assert.assertEquals(1, res);
    }

    @Test
    public void testSum_2(){
        int[] nums = new int[]{3,0,1};
        int res = missingNumber.findMissingNumber(nums);
        Assert.assertEquals(2, res);
    }

    @Test
    public void testSum_3(){
        int[] nums = new int[]{9,6,4,2,3,5,7,0,1};
        int res = missingNumber.findMissingNumber(nums);
        Assert.assertEquals(8, res);
    }
}
