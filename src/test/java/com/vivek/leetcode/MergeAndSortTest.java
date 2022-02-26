package com.vivek.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class MergeAndSortTest {

    private MergeAndSort mergeAndSort = new MergeAndSort();

    @Test
    public void testOneSizeArrays(){
        int[] num1 = new int[]{1};
        int m = 1;
        int[] num2 = new int[]{2};
        int n = 1;
        int[] p = mergeAndSort.mergeAndSort(num1, m, num2, n);
        Assert.assertEquals(2, p.length);
        Assert.assertEquals(2, p[1]);
    }

    @Test
    public void testOneTwoSizeArrays(){
        int[] num1 = new int[]{1};
        int m = 1;
        int[] num2 = new int[]{1, 2};
        int n = 2;
        int[] p = mergeAndSort.mergeAndSort(num1, m, num2, n);
        Assert.assertEquals(3, p.length);
        Assert.assertEquals(1, p[1]);
    }

    @Test
    public void testMultipleSizeArrays(){
        int[] num1 = new int[]{1,2,3};
        int m = 3;
        int[] num2 = new int[]{2,5,6};
        int n = 3;
        int[] p = mergeAndSort.mergeAndSort(num1, m, num2, n);
        Assert.assertEquals(6, p.length);
        Assert.assertEquals(2, p[1]);
        System.out.println("p.toString() = " + p.toString());
    }
}
