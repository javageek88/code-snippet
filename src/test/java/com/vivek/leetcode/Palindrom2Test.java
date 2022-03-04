package com.vivek.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Palindrom2Test {

    @Test
    public void testWithEmptyString(){
        Palindrom2 palindrom = new Palindrom2();
        Assert.assertTrue(palindrom.isPalindrom(""));
    }

    @Test
    public void testWithOneCharAsSpace(){
        Palindrom2 palindrom = new Palindrom2();
        Assert.assertTrue(palindrom.isPalindrom(" "));
    }

    @Test
    public void testWithOneChar(){
        Palindrom2 palindrom = new Palindrom2();
        Assert.assertTrue(palindrom.isPalindrom("a"));
    }

    @Test
    public void testWithTwoChar(){
        Palindrom2 palindrom = new Palindrom2();
        Assert.assertTrue(palindrom.isPalindrom("aa"));
    }

    @Test
    public void testWithMultipleOddChar(){
        Palindrom2 palindrom = new Palindrom2();
        Assert.assertTrue(palindrom.isPalindrom("aba"));
    }

    @Test
    public void testWithMultipleOddCharFailure(){
        Palindrom2 palindrom = new Palindrom2();
        Assert.assertTrue(palindrom.isPalindrom("aban"));
    }

    @Test
    public void testWithMultipleOddCharLong(){
        Palindrom2 palindrom = new Palindrom2();
        Assert.assertTrue(palindrom.isPalindrom("ab an n na ba "));
    }

    @Test
    public void testWithMultipleOddCharLongWithAdditionalChars(){
        Palindrom2 palindrom = new Palindrom2();
        Assert.assertTrue(palindrom.isPalindrom("ab 7an n na7 ba "));
    }

    @Test
    public void testWithMultipleOddCharLongWithAdditionalChars_2(){
        Palindrom2 palindrom = new Palindrom2();
        Assert.assertTrue(palindrom.isPalindrom("ab 7an; n na7 ba "));
    }

    @Test
    public void testWithMultipleOddCharLongWithAdditionalChars_3(){
        Palindrom2 palindrom = new Palindrom2();
        Assert.assertTrue(palindrom.isPalindrom("ab 7an; n na7 ba ___ "));
    }

    @Test
    public void testWithMultipleOddCharWithAdditionalCharsWithOneCharToRemove(){
        Palindrom2 palindrom = new Palindrom2();
        Assert.assertTrue(palindrom.isPalindrom("aba"));
    }

    @Test
    public void testWithMultipleOddCharWithAdditionalCharsWithOneCharToRemove_1(){
        Palindrom2 palindrom = new Palindrom2();
        Assert.assertFalse(palindrom.isPalindrom("abc"));
    }

    @Test
    public void testWithMultipleEvenCharWithAdditionalCharsWithOneCharToRemove(){
        Palindrom2 palindrom = new Palindrom2();
        Assert.assertTrue(palindrom.isPalindrom("abaa"));
    }

    @Test
    public void testWithMultipleOddCharLongWithAdditionalCharsWithOneCharToRemove(){
        Palindrom2 palindrom = new Palindrom2();
        Assert.assertTrue(palindrom.isPalindrom("ab 7an; nd na7 ba ___ "));
    }

    @Test
    public void testWithMultipleOddCharLongWithAdditionalCharsWithOneCharToRemove_1(){
        Palindrom2 palindrom = new Palindrom2();
        Assert.assertTrue(palindrom.isPalindrom("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"));
    }

    @Test
    public void testWithMultipleOddCharLongWithAdditionalCharsWithOneCharToRemove_2(){
        Palindrom2 palindrom = new Palindrom2();
        Assert.assertFalse(palindrom.isPalindrom("tebbem"));
    }

    @Test
    public void testWithMultipleOddCharLongWithAdditionalCharsWithOneCharToRemove_3(){
        Palindrom2 palindrom = new Palindrom2();
        Assert.assertTrue(palindrom.isPalindrom("abca"));
    }


}
