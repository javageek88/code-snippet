package com.vivek.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2,
 * also represented as a string.
 *
 * Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.
 * Example 1:
 * Input: num1 = "2", num2 = "3"
 * Output: "6"
 * Example 2:
 *
 * Input: num1 = "123", num2 = "456"
 * Output: "56088"
 *
 */
public class MultiPlyStringsTest {

    @Test
    public void productOfTwoStringNumbers(){
        MultiPlyString multiplyString = new MultiPlyString();
        String result = multiplyString.productOfTwoNumbers("5", "4");
        Assert.assertEquals("20", result);
    }

    @Test
    public void testMultiPlyMultiDigitStringNumbers(){
        MultiPlyString multiplyString = new MultiPlyString();
        String result = multiplyString.productOfTwoNumbers("10", "9");
        Assert.assertEquals("90", result);
    }

    @Test
    public void testMultiPlyMultiDigitStringNumbersOverFlowFail(){
        MultiPlyString multiplyString = new MultiPlyString();
        String result = multiplyString.productOfTwoNumbers("123", "456");
        Assert.assertEquals("56088", result);
    }

    @Test
    public void testMultiPlyMultiDigitStringNumbersOverFlow(){
        MultiPlyString multiplyString = new MultiPlyString();
        String result = multiplyString.productOfTwoNumbers("123456", "123456");
        Assert.assertEquals("15241383936", result);
    }

}
