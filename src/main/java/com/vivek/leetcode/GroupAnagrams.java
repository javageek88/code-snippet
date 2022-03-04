package com.vivek.leetcode;

import org.assertj.core.util.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 *
 *
 *
 * Example 1:
 *
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * Example 2:
 *
 * Input: strs = [""]
 * Output: [[""]]
 * Example 3:
 *
 * Input: strs = ["a"]
 * Output: [["a"]]
 */
public class GroupAnagrams {

    /*public List<List<String>> groupAnagrams(String[] inputAnagrams) {
        if (Arrays.isNullOrEmpty(inputAnagrams)) return new ArrayList<>();
        //create Map with <Key, List<String>> = <sort and store key, List<String>>>
        //sort string if exist in map then add the string to array list
        //else add new key with sorted string
        final Map<String, List<String>> anagramMap = new HashMap<>();
        for (int i = 0; i< inputAnagrams.length; i++){
            char[] keyArray = inputAnagrams[i].toLowerCase().toCharArray();
            java.util.Arrays.sort(keyArray);
            String keyString = String.valueOf(keyArray);
            if(anagramMap.containsKey(keyString)){
                anagramMap.get(keyString).add(inputAnagrams[i]);

            }else{
                List<String> resList = new ArrayList<>();
                resList.add(inputAnagrams[i]);
                anagramMap.put(keyString, new ArrayList<>(resList));
            }
        }
        return new ArrayList<>(anagramMap.values());
    }*/


    public List<List<String>> groupAnagrams(String[] inputAnagrams) {
        if (Arrays.isNullOrEmpty(inputAnagrams)) return new ArrayList<>();
        final Map<String, List<String>> anagramMap = new HashMap<>();
        int[] count = new int[26];
        for (String s : inputAnagrams){
            java.util.Arrays.fill(count, 0);
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder("");
            for(int i=0; i< 26; i++){
                sb.append("#");
                sb.append(count[i]);
            }

            if(anagramMap.containsKey(sb.toString())){
                anagramMap.get(sb.toString()).add(s);

            }else{
                List<String> resList = new ArrayList<>();
                resList.add(s);
                anagramMap.put(sb.toString(), new ArrayList<>(resList));
            }
        }
        return new ArrayList<>(anagramMap.values());
    }
}
