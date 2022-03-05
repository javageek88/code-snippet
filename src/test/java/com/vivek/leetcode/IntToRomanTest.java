package com.vivek.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class IntToRomanTest {

    private IntToRoman intToRoman = new IntToRoman();

    @Test
    public void testOneInRoman(){
        int intVal = 1;
        String returnVal = intToRoman.convert(intVal);
        Assert.assertEquals("I", returnVal);
    }

    @Test
    public void testTwoInRoman(){
        int intVal = 2;
        String returnVal = intToRoman.convert(intVal);
        Assert.assertEquals("II", returnVal);
    }

    @Test
    public void testThreeInRoman(){
        int intVal = 3;
        String returnVal = intToRoman.convert(intVal);
        Assert.assertEquals("III", returnVal);
    }

    @Test
    public void testFourInRoman(){
        int intVal = 4;
        String returnVal = intToRoman.convert(intVal);
        Assert.assertEquals("IV", returnVal);
    }

    @Test
    public void testFiveInRoman(){
        int intVal = 5;
        String returnVal = intToRoman.convert(intVal);
        Assert.assertEquals("V", returnVal);
    }

    @Test
    public void testSixInRoman(){
        int intVal = 6;
        String returnVal = intToRoman.convert(intVal);
        Assert.assertEquals("VI", returnVal);
    }

    @Test
    public void testSevenInRoman(){
        int intVal = 7;
        String returnVal = intToRoman.convert(intVal);
        Assert.assertEquals("VII", returnVal);
    }

    @Test
    public void testEightInRoman(){
        int intVal = 8;
        String returnVal = intToRoman.convert(intVal);
        Assert.assertEquals("VIII", returnVal);
    }

    @Test
    public void testNineInRoman(){
        int intVal = 9;
        String returnVal = intToRoman.convert(intVal);
        Assert.assertEquals("IX", returnVal);
    }

    @Test
    public void testTenInRoman(){
        int intVal = 10;
        String returnVal = intToRoman.convert(intVal);
        Assert.assertEquals("X", returnVal);
    }
}
