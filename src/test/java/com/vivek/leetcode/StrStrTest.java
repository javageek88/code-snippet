package com.vivek.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class StrStrTest {

    private static StrStr strStr = new StrStr();

    @Test
    public void testEmpty(){
        String needle = "";
        String hayStack = "";
        Assert.assertEquals(0, strStr.findMatch(hayStack, needle));
    }

    @Test
    public void testNotValidNeedle(){
        String needle = "needle";
        String hayStack = "haystack";
        Assert.assertEquals(-1, strStr.findMatch(hayStack, needle));
    }

    @Test
    public void testValidNeedle(){
        String needle = "ll";
        String hayStack = "hello";
        Assert.assertEquals(2, strStr.findMatch(hayStack, needle));
    }

    @Test
    public void testValidNeedleEquals(){
        String needle = "hello";
        String hayStack = "hello";
        Assert.assertEquals(0, strStr.findMatch(hayStack, needle));
    }

    @Test
    public void testValid_1(){
        String needle = "o";
        String hayStack = "hello";
        Assert.assertEquals(4, strStr.findMatch(hayStack, needle));
    }

    @Test
    public void testValid_2(){
        String needle = "aaaaa";
        String hayStack = "bba";
        Assert.assertEquals(-1, strStr.findMatch(hayStack, needle));
    }

    @Test
    public void testValid_3(){
        String needle = "bba";
        String hayStack = "aaaaa";
        Assert.assertEquals(0, strStr.findMatch(hayStack, needle));
    }
}
