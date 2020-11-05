package com.vivek.leetcode;

public class PallindromNumber {
    public static boolean isPallindromNUmber(int inputNumber){
        int reverseNumber = 0;
        int number = inputNumber;
        if(number < 0) return  false;
        while(number!=0){
            reverseNumber = reverseNumber * 10 + number %10;
            number = number / 10;
        }
        if(inputNumber == reverseNumber) return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println("121 = " + isPallindromNUmber(121));
        System.out.println("-121 = " + isPallindromNUmber(-121));
        System.out.println("10 = " + isPallindromNUmber(10));
    }
}
