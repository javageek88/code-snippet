package com.vivek.leetcode;

import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

public class CharReplacement {

    public static int characterReplacement(String s, int k) {
        int left = 0, right = 0;
        int maxRepChar = 0;
        int maxLength = 0;
        final Map<Character, Integer> charFrequency = new HashMap<>();
        while(right < s.length()){
            char c = s.charAt(right);
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
            maxRepChar = Math.max(maxRepChar, charFrequency.get(c));
            if(right - left + 1 - maxRepChar > k){
                char l = s.charAt(left);
                charFrequency.put(l, charFrequency.get(l) - 1);
                left += 1;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            right += 1;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        Assert.assertEquals(4, characterReplacement("AABABBA", 1));
    }
}
