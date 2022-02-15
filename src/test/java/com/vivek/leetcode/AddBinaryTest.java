package com.vivek.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class AddBinaryTest {

    @Test
    public void addBinaryTestWithOneBitOnOn(){
        AddBinary addBinary = new AddBinary();
        String result = addBinary.addBinary("1", "1");
        Assert.assertEquals("10", result);
    }

    @Test
    public void addBinaryTestWithOneBitOnOff(){
        AddBinary addBinary = new AddBinary();
        String result = addBinary.addBinary("1", "0");
        Assert.assertEquals("1", result);
    }

    @Test
    public void addBinaryTestWithOneBitOffOn(){
        AddBinary addBinary = new AddBinary();
        String result = addBinary.addBinary("0", "1");
        Assert.assertEquals("1", result);
    }

    @Test
    public void addBinaryTestWithTwoBitsOnOn(){
        AddBinary addBinary = new AddBinary();
        String result = addBinary.addBinary("11", "11");
        Assert.assertEquals("110", result);
    }

    @Test
    public void addBinaryTestWithTwoBitsOnOff(){
        AddBinary addBinary = new AddBinary();
        String result = addBinary.addBinary("11", "10");
        Assert.assertEquals("101", result);
    }

    @Test
    public void addBinaryTestWithThreeBitsOnOff(){
        AddBinary addBinary = new AddBinary();
        String result = addBinary.addBinary("111", "100");
        Assert.assertEquals("1011", result);
    }

    @Test
    public void addBinaryTestWithThreeBitsOnOn(){
        AddBinary addBinary = new AddBinary();
        String result = addBinary.addBinary("111", "111");
        Assert.assertEquals("1110", result);
    }

    @Test
    public void addBinaryTestWithMultiBitsOnOn(){
        AddBinary addBinary = new AddBinary();
        String result = addBinary.addBinary("111", "1");
        Assert.assertEquals("1000", result);
    }
}
