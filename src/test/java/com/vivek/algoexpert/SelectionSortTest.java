package com.vivek.algoexpert;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SelectionSortTest {

    private SelectionSort selectionSort = new SelectionSort();

    @Test
    public void test_case_1(){
        int[] array = new int[]{5, 3, 10, 2, 1};
        int[] returnArray = selectionSort.selectionSort(array);
        Assert.assertEquals(0, Arrays.compare(new int[]{1, 2, 3, 5, 10}, returnArray));
    }

    @Test
    public void test_case_2(){
        int[] array = new int[]{12, 3, 8, 20, 15};
        int[] returnArray = selectionSort.selectionSort(array);
        Assert.assertEquals(0, Arrays.compare(new int[]{3, 8, 12, 15, 20}, returnArray));
    }
}
