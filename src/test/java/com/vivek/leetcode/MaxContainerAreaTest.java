package com.vivek.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class MaxContainerAreaTest {

    private MaxContainerArea maxContainerArea = new MaxContainerArea();

    @Test
    public void testWithContainerExample_1(){
        int[] height = new int[]{1,1};
        int maxArea = maxContainerArea.maxArea(height);
        Assert.assertEquals(1, maxArea);
    }


    @Test
    public void testWithContainerExample_2(){
        int[] height = new int[]{1,1, 3, 6, 1, 8, 2};
        int maxArea = maxContainerArea.maxArea(height);
        Assert.assertEquals(12, maxArea);
    }

    @Test
    public void testWithContainerExample_3(){
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        int maxArea = maxContainerArea.maxArea(height);
        Assert.assertEquals(49, maxArea);
    }
}
