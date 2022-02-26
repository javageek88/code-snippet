package com.vivek.leetcode;

public class Palindrom {

    /*
    public boolean isPalindrom(String input) {
        if(StringUtils.isEmpty(input)){
            return true;
        }
        StringBuilder plainString = new StringBuilder();
        for(int i=0; i<input.length() ;i++){
            if(Character.isLetterOrDigit(input.charAt(i))){
                plainString.append(input.charAt(i));
            }
        }
        String filteredString = plainString.toString();
        String filteredReverseString = plainString.reverse().toString();
        if(filteredString.equals(filteredReverseString)) return true;
        return false;
    }*/

    /**
     * Another better solution
     * @param input
     * @return
     */
    public boolean isPalindrom(String input){
        for(int i=0, j=input.length() -1 ; i<j; i++, j--){
            while(i<j && !Character.isLetterOrDigit(input.charAt(i))){
                i++;
            }
            while(i<j && !Character.isLetterOrDigit(input.charAt(j))){
                j--;
            }
            if(Character.toLowerCase(input.charAt(i)) != Character.toLowerCase(input.charAt(j))){
                return false;
            }
        }
        return true;
    }
}
