package com.vivek.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class AddStringsTest {

    @Test
    public void testAddStrings(){
        AddString addString = new AddString();
        String result = addString.add("1", "9");
        Assert.assertEquals("10", result);
    }
}
