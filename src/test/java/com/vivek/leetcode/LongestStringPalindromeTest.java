package com.vivek.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class LongestStringPalindromeTest {

    private LongestStringPalindrome longestStringPalindrome = new LongestStringPalindrome();

    @Test
    public void test_palindrome_1(){
        String input = "babad";
        String returnString = longestStringPalindrome.longestPalindrome(input);
        Assert.assertEquals("bab", returnString);
    }
}
