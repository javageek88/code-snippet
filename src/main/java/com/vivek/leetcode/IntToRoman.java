package com.vivek.leetcode;

/***
 * Symbol       Value
 * M             1000
 *                      CM      900
 * D             500
 *                      CD      400
 * C             100
 *                      XC      90
 * L             50
 *                      XL      40
 * X             10
 *                      IX      9
 * V             5
 *                      IV      4
 * I             1
 */
public class IntToRoman {

    private int[] values = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private String[] symbols = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public String convert(int intVal) {
        final StringBuilder sb = new StringBuilder();

        for(int i = 0; i<values.length && intVal > 0; i++){
            while(values[i] <= intVal){
                intVal -= values[i];
                sb.append(symbols[i]);
            }
        }
        return sb.toString();
    }
}
