package com.vivek.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 *
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
 *
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 *
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given a roman numeral, convert it to an integer.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "III"
 * Output: 3
 * Example 2:
 *
 * Input: s = "IV"
 * Output: 4
 * Example 3:
 *
 * Input: s = "IX"
 * Output: 9
 * Example 4:
 *
 * Input: s = "LVIII"
 * Output: 58
 * Explanation: L = 50, V= 5, III = 3.
 * Example 5:
 *
 * Input: s = "MCMXCIV"
 * Output: 1994
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 15
 * s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
 * It is guaranteed that s is a valid roman numeral in the range [1, 3999].
 */
public class RomanIntegerCoversion {
    public static Map<Character, Integer> romanIntegerMapping = new HashMap<>(7);
    static{
        romanIntegerMapping.put('I', 1);
        romanIntegerMapping.put('V', 5);
        romanIntegerMapping.put('X', 10);
        romanIntegerMapping.put('L', 50);
        romanIntegerMapping.put('C', 100);
        romanIntegerMapping.put('D', 500);
        romanIntegerMapping.put('M', 1000);
    }

    public static int romanToInt(String romanNumber) {
        char[] roamnNumberChar = romanNumber.toCharArray();
        if(roamnNumberChar.length == 1) return romanIntegerMapping.get(roamnNumberChar[0]);
        int value = 0;
        int minusValue = 0;
        for (int i = 0; i<roamnNumberChar.length; i++) {//MCMXCIV - 0123456
            if(roamnNumberChar[i] == 'I'){
                if(i < romanNumber.indexOf('V', i) || i < romanNumber.indexOf('X', i)) {
                    minusValue += romanIntegerMapping.get(roamnNumberChar[i]); continue;
                }
            }
            if(roamnNumberChar[i] == 'X') {
                if (i < romanNumber.indexOf('L', i) || i < romanNumber.indexOf('C', i)) {
                    minusValue += romanIntegerMapping.get(roamnNumberChar[i]);
                    continue;
                }
            }
            if(roamnNumberChar[i] == 'C'){
                if(i < romanNumber.indexOf('D', i) || i < romanNumber.indexOf('M', i)) {
                    minusValue += romanIntegerMapping.get(roamnNumberChar[i]); continue;
                }
            }
            value = value + romanIntegerMapping.get(roamnNumberChar[i]);
        }
        return value - minusValue;
    }

    public static void main(String[] args) {
        System.out.println("romanToInt(\"III\") = " + romanToInt("III"));
        System.out.println("romanToInt(\"IV\") = " + romanToInt("IV"));
        System.out.println("romanToInt(\"IX\") = " + romanToInt("IX"));
        System.out.println("romanToInt(\"LVIII\") = " + romanToInt("LVIII"));
        System.out.println("romanToInt(\"MCMXCIV\") = " + romanToInt("MCMXCIV"));
        System.out.println("romanToInt(\"MCDLXXVI\") = " + romanToInt("MCDLXXVI"));
        //1100 + 550 + 20 + 6 = 1676
    }
}
