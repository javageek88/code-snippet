package com.vivek.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LengthOfSubString {
    public static void main(String[] args) {
        System.out.println("Result = " + lengthOfLongestSubstring("abcabcbb"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            System.out.println("ans = " + ans);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }

    /**
     * 1. window approach - keep left, right pointer for tracking the substrings
     2. Iterate over each char in the string
     3. keep track of index and char of string - store in map
     4. check if char is duplicate (check if exists in map) if yes take the position from map and start from there and repeat above
     5. substring will be left index and right index
     */

    /**public static int longestSubstring(String s){
     System.out.println("I am here in longestSubstring method... \nInput string :" + s);
     int left = 0, right = 0;
     int result = 0;
     Map<Character, Integer> indexMap = new HashMap<Character, Integer>();
     while(right < s.length()){
     if(indexMap.containsKey(s.charAt(right))){
     System.out.println("M in if loop...");
     left = Math.max(indexMap.get(s.charAt(right)), left);
     }
     indexMap.put(s.charAt(right), right+1);
     result = Math.max(result, right - left + 1);
     System.out.println("Result : "+ result + " left : "+ left + " right : "+ right);
     right++;
     }
     return result;
     }*/
}
