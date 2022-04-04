package com.vivek.leetcode;

public class StrStr {

    public int findMatch(String hayStack, String needle) {
        if(needle.length() > hayStack.length()) return -1;
        if(hayStack.isEmpty() || needle.isEmpty() || needle.equals(hayStack)){
            return 0;
        }
        for (int i = 0; i < needle.length(); i++){
            int j = 0;
            while(j < hayStack.length()){
                if(hayStack.charAt(j) == needle.charAt(i)){
                    return j;
                }
                j++;
            }
        }
        return -1;
    }
}
