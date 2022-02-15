package com.vivek.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ArrayAddNumberTest {

    @Test
    public void testAddOneDigit(){
        ArrayAddNumber arrayAddNumber = new ArrayAddNumber();
        int[] numberOne = new int[]{1};
        List<Integer> result = arrayAddNumber.addNumber(numberOne, 1);
        Assert.assertEquals(2, result.get(0).intValue());
    }

    @Test
    public void testAddOneDigit2(){
        ArrayAddNumber arrayAddNumber = new ArrayAddNumber();
        int[] numberOne = new int[]{1};
        List<Integer> result = arrayAddNumber.addNumber(numberOne, 9);
        Assert.assertEquals(0, result.get(1).intValue());
        Assert.assertEquals(1, result.get(0).intValue());
    }
}
