package com.vivek.algorithm;

/**
 * Algorithm to find if given string is permutation of palindrome strings
 */
public class PalindromeString {
    /*
    * find frequency of all characters in string
    * find only one character has odd frequency
    * if one odd frequency then its a permutation of palindrome strings
    * */

    public static void main(String[] args) {
        int [] indexTable = frequencyOfCharacters("abcba");
        printTable(indexTable);
        boolean isPalindrome = oddCharacterCount(indexTable);
        System.out.println("\nisPalindrome String = " + isPalindrome);
    }

    private static boolean oddCharacterCount(int[] indexTable) {
        boolean oddCharFound = false;
        for (int i : indexTable) {
            if( i % 2 == 1){
                if(oddCharFound){
                    return false;
                }
                oddCharFound = true;
            }
        }
        return true;
    }

    private static void printTable(int[] indexTable) {
        System.out.println("Table for all indexes : ");
        for (int i : indexTable) System.out.print("," + i);
    }

    private static int[] frequencyOfCharacters(String inputString){
        int [] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a')];

        for (Character c : inputString.toCharArray()){
            int charPosition = getCharacterPosition(Character.getNumericValue(c));
            if(charPosition >= 0){
                table[charPosition]++;
            }
        }
        return table;
    }

    private static int getCharacterPosition(int c) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        if(a <= c && c <= z){
            return c - a;
        }
        return -1;
    }

}
