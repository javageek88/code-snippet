package com.vivek.leetcode;

public class LongestCommonPrefix {
    private static String longestCommonPrefix(String [] strs){
        //iterate over array of strings
        //iterate over the individual strings and see if characters match
        if(strs.length < 1) return "";
        if(strs.length == 1) return strs[0];
        int i = 0;
        String longest = strs[0];
        String shortest = strs[1];
        StringBuilder compareString = new StringBuilder("");
        if(strs[0].length() < strs[1].length()) {
            longest = strs[1];
            shortest = strs[0];
        }
        for (char ch : shortest.toCharArray()){
            if(ch == longest.toCharArray()[i]){
                compareString.append(ch);
            }else{
                break;
            }
            i++;
        }
        if(compareString.toString().length() == 0) return compareString.toString();
        StringBuilder returnString = new StringBuilder("");
        if(strs.length > 2){
            for (int j = 2; j< strs.length; j++){
                i = 0;
                if(j !=2 ) compareString = returnString;
                returnString = new StringBuilder("");
                for (char ch : compareString.toString().toCharArray()){
                    if(strs[j].length() > 0 && strs[j].toCharArray().length > i && ch == strs[j].toCharArray()[i]){
                        returnString.append(ch);
                    }else{
                        break;
                    }
                    i++;
                }
            }
        }else{
            returnString = compareString;
        }
        return returnString.toString();
    }
    public static void main(String[] args) {
        //System.out.println(" first = " + longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(" second = " + longestCommonPrefix(new String[]{"abab", "aba", "", "a"}));
    }
}
