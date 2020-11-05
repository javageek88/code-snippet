package com.vivek.leetcode;

import java.util.stream.Stream;

public class ReverseInteger {
    public static int reverseInteger(int input){
        Integer returnInteger = 0;
        while(input != 0){
            int reverse_integer = returnInteger * 10 + input %10;
            if((reverse_integer - input %10) /10 != returnInteger) return 0 ;
            else returnInteger = reverse_integer;
            input = input / 10;
        }
        return returnInteger;
    }
    public static void main(String[] args) {
        //System.out.println("321 = " + reverseInteger(321));
        System.out.println("1534236469 = " + reverseInteger(1534236469));
    }
}
