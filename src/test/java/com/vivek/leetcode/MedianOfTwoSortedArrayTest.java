package com.vivek.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class MedianOfTwoSortedArrayTest {

    private MedianOfTwoSortedArray medianOfTwoSortedArray = new MedianOfTwoSortedArray();

    @Test
    public void test_med_arr_1(){
        int[] b = new int[]{3};
        double median = medianOfTwoSortedArray.findMedian(null, b);
        Assert.assertEquals(3.0, median, 0.0);
    }

    @Test
    public void test_med_arr_2(){
        int[] a = new int[]{2};
        double median = medianOfTwoSortedArray.findMedian(a, null);
        Assert.assertEquals(2, median, 0.0);
    }

    @Test
    public void test_med_arr_3(){
        int[] a = new int[]{1};
        int[] b = new int[]{3};
        double median = medianOfTwoSortedArray.findMedian(a, b);
        Assert.assertEquals(2.0, median, 0.0);
    }

    @Test
    public void test_med_arr_4(){
        int[] a = new int[]{1, 3};
        int[] b = new int[]{2};
        double median = medianOfTwoSortedArray.findMedian(a, b);
        Assert.assertEquals(2.0, median, 0.0);
    }

    @Test
    public void test_med_arr_5(){
        int[] a = new int[]{1, 2};
        int[] b = new int[]{3, 4};
        double median = medianOfTwoSortedArray.findMedian(a, b);
        Assert.assertEquals(2.5, median, 0.0);
    }

    @Test
    public void test_med_arr_6(){
        int[] a = new int[]{1, 3};
        int[] b = new int[]{2, 7};
        double median = medianOfTwoSortedArray.findMedian(a, b);
        Assert.assertEquals(2.5, median, 0.0);
    }

    @Test
    public void test_med_arr_7(){
        int[] a = new int[]{2};
        int[] b = new int[]{1, 3};
        double median = medianOfTwoSortedArray.findMedian(a, b);
        Assert.assertEquals(2.0, median, 0.0);
    }
}
