package com.vivek.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class MinimumWindowSubStrTest {

    private static MinimumWindowSubStr minimumWindowSubStr = new MinimumWindowSubStr();

    @Test
    public void testMin_Window_1(){
        String s = "";
        String t = "";
        String r = minimumWindowSubStr.findMatch(s, t);
        Assert.assertEquals("", r);
    }

    @Test
    public void testMin_Window_2(){
        String s = "a";
        String t = "a";
        String r = minimumWindowSubStr.findMatch(s, t);
        Assert.assertEquals("a", r);
    }

    @Test
    public void testMin_Window_3(){
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String r = minimumWindowSubStr.findMatch(s, t);
        Assert.assertEquals("BANC", r);
    }

    @Test
    public void testMin_Window_4(){
        String s = "a";
        String t = "aa";
        String r = minimumWindowSubStr.findMatch(s, t);
        Assert.assertEquals("", r);
    }

    @Test
    public void testMin_Window_5(){
        String s = "bbaa";
        String t = "aba";
        String r = minimumWindowSubStr.findMatch(s, t);
        Assert.assertEquals("baa", r);
    }
}
