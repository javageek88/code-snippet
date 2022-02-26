package com.vivek.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class PalindromTest {

    @Test
    public void testWithEmptyString(){
        Palindrom palindrom = new Palindrom();
        Assert.assertTrue(palindrom.isPalindrom(""));
    }

    @Test
    public void testWithOneCharAsSpace(){
        Palindrom palindrom = new Palindrom();
        Assert.assertTrue(palindrom.isPalindrom(" "));
    }

    @Test
    public void testWithOneChar(){
        Palindrom palindrom = new Palindrom();
        Assert.assertTrue(palindrom.isPalindrom("a"));
    }

    @Test
    public void testWithTwoChar(){
        Palindrom palindrom = new Palindrom();
        Assert.assertTrue(palindrom.isPalindrom("aa"));
    }

    @Test
    public void testWithMultipleOddChar(){
        Palindrom palindrom = new Palindrom();
        Assert.assertTrue(palindrom.isPalindrom("aba"));
    }

    @Test
    public void testWithMultipleOddCharFailure(){
        Palindrom palindrom = new Palindrom();
        Assert.assertFalse(palindrom.isPalindrom("aban"));
    }

    @Test
    public void testWithMultipleOddCharLong(){
        Palindrom palindrom = new Palindrom();
        Assert.assertTrue(palindrom.isPalindrom("ab an n na ba "));
    }

    @Test
    public void testWithMultipleOddCharLongWithAdditionalChars(){
        Palindrom palindrom = new Palindrom();
        Assert.assertTrue(palindrom.isPalindrom("ab 7an n na7 ba "));
    }

    @Test
    public void testWithMultipleOddCharLongWithAdditionalChars_2(){
        Palindrom palindrom = new Palindrom();
        Assert.assertTrue(palindrom.isPalindrom("ab 7an; n na7 ba "));
    }

    @Test
    public void testWithMultipleOddCharLongWithAdditionalChars_3(){
        Palindrom palindrom = new Palindrom();
        Assert.assertTrue(palindrom.isPalindrom("ab 7an; n na7 ba ___ "));
    }
}
