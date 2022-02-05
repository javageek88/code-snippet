package com.vivek.leetcode;

import java.util.HashMap;

public class FirstNonRepeatingCharInString {
    public static void main(String[] args) {
        System.out.println("indexOfFirstNonRepeatingChar(\"abcabcbbe\") = " + indexOfFirstNonRepeatingChar("abcabcbbe"));
        System.out.println("indexOfFirstNonRepeatingChar(\"abceabcbb\") = " + indexOfFirstNonRepeatingChar("abceabcbb"));
    }

    /**
     1. Convert string to array of characters
     2. iterate over the char array first to last
     3. check if char exist or not (get the index)
     */
    public static int indexOfFirstNonRepeatingChar(String s){
        char[] chars = s.toCharArray();
        for(int i=0; i<s.length(); i++){
            char checkChar = chars[i];
            boolean exists = false;
            for(int j=0; j<s.length(); j++){
                if(checkChar == chars[j] && i!=j) exists = true;
            }
            if(!exists) return i;
        }
        return -1;
    }
    /*time complexity = o(n^2)*/

    public static int indexOfFirstNonRepeatingCharWithMap(String s) {
        HashMap<Character, Integer> count  = new HashMap<Character, Integer>();
        int n = s.length();
        // build hash map : character and how often it appears
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        // find the index
        for (int i = 0; i < n; i++) {
            if (count.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }

}
