package com.vivek.algorithm;

/**
 * An algorithm to determine if a string has all unique characters
 * what if you can not use additional data structures?
 */
public class UniqueString {
    public static void main(String[] args) {
        System.out.println(" abhhbdhbdhsbdhashadbbdbhbasd = " + isUniqueChars("abhhbdhbdhsbdhashadbbdbhbasd"));
        System.out.println(" abcdef = " + isUniqueChars("abcdef"));

        System.out.println(" abhhbdhbdhsbdhashadbbdbhbasd = " + isUniqueChars2("abhhbdhbdhsbdhashadbbdbhbasd"));
        System.out.println(" abcdef = " + isUniqueChars2("abcdef"));
    }


    /**
     * Time complexity = o(n) - n is length of string
     * Space complexity = o(1)
     * @param str input string
     * @return true/false if the unique char exist in string
     */
    private static boolean isUniqueChars(String str) {
        //ASCII chars - 8 bytes - 2^7 = 128
        if (str.length() > 128) {
            return false;
        }
        boolean[] charSet = new boolean[128];
        for (int i = 0; i < str.length(); i++){
            int val = str.charAt(i);
            if(charSet[val]){
                return false;
            }
            charSet[val] = true;
        }
            return true;
    }

    private static boolean isUniqueChars2(String str){
        int checker = 0;
        for (int i = 0; i < str.length(); i++){
            int val = str.charAt(i) - 'a';
            //bitwise and and shift left
            if((checker & (1 << val)) > 0){
                return false;
            }
            //bitwise or
            checker |= (1 << val);
        }
        return true;
    }
}
