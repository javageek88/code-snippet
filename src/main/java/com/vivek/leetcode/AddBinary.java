package com.vivek.leetcode;

import java.math.BigInteger;

public class AddBinary {

    //Bit-by-Bit Computation

    /*public String add(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int length = 0;
        if(num1.length() > num2.length()) length = num1.length();
        else length = num2.length();

        Character carry = '0';
        for(int i= length - 1; i>-1; i--){
            if((num1.charAt(i) == '0' && num2.charAt(i) == '1') || (num1.charAt(i) == '1' && num2.charAt(i) == '0')) {
                sb.append("1");
            }
            if(num1.charAt(i) == '1' && num2.charAt(i) == '1' && carry == '1'){
                carry = '1';
                sb.append("1");
            }
            if((num1.charAt(i) == '1' && num2.charAt(i) == '1' && carry == '0') || (num1.charAt(i) == '1' && num2.charAt(i) == '0' && carry == '1') || (num1.charAt(i) == '0' && num2.charAt(i) == '1' && carry == '1')) {
                sb.append("0");
                carry = '1';
            }
        }
        if(carry == '1'){
            sb.append(carry);
        }
        return reverseMe(sb.toString());
    }

    public String reverseMe(String bitByBitNumber){
        StringBuilder sb = new StringBuilder();
        for(int i = bitByBitNumber.length() - 1; i > -1; i--){
            sb.append(bitByBitNumber.charAt(i));
        }
        return sb.toString();
    }*/

    /*public String addBinary(String num1, String num2){
        int a = num1.length(), b = num2.length();
        if(a < b) return addBinary(num2, num1);
        int L = Math.max(a, b);
        int j = b - 1, carry = 0;
        StringBuilder sb = new StringBuilder();
        for(int i= L - 1; i>-1; i--){
            if(num1.charAt(i) == '1') ++carry;
            if(j > -1 && num2.charAt(j--) == '1') ++carry;
            if(carry % 2 == 1) sb.append("1");
            else sb.append("0");
            carry /= 2;
        }
        if (carry == 1) sb.append("1");
        return sb.reverse().toString();
    }*/

    public String addBinary(String num1, String num2){
        BigInteger a = new BigInteger(num1, 2);
        BigInteger b = new BigInteger(num2, 2);
        BigInteger zero = new BigInteger("0", 2);
        BigInteger answer, carry;
        //while carry!=0
        //answer = a ^ b;
        //carry = a & b << 1

        while(b.compareTo(zero) != 0){
            answer = a.xor(b);
            carry = a.and(b).shiftLeft(1);
            a = answer;
            b = carry;
        }
        return a.toString(2);
    }
}
