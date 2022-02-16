package com.vivek.leetcode;

public class AddString {

    public String add(String num1, String num2) {
        int p1 = num1.length() - 1;
        int p2 = num2.length() - 1;
        int carry = 0;
        StringBuilder ans = new StringBuilder();
        while (p1 >= 0 || p2 >= 0) {
            int x = p1 >= 0 ? num1.charAt(p1) - '0' : 0;
            int y = p2 >= 0 ? num2.charAt(p2) - '0' : 0;
            int digit = (x + y + carry) % 10;
            carry = (x + y + carry) / 10;
            ans.append(digit);
            p1--;
            p2--;
        }
        if (carry > 0) {
            ans.append(carry);
        }
        return ans.reverse().toString();
    }
}
