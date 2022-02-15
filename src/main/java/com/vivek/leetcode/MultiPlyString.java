package com.vivek.leetcode;

public class MultiPlyString {

    public boolean validateIntegerParams(String num1, String num2) {
        if(num1 == null || num2 == null || num1.length() <=0 || num2.length() <= 0 || !Character.isDigit(num1.charAt(0)) || !Character.isDigit(num2.charAt(0))){
            return false;
        }
        return true;
    }

    public String productOfTwoNumbers(String num1, String num2) {
        if(validateIntegerParams(num1, num2)){
            return String.valueOf(Integer.parseInt(num1) * Integer.parseInt(num2));
        }
        return null;
    }
}
