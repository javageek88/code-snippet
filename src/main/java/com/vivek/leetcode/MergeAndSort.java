package com.vivek.leetcode;

import java.util.Arrays;

public class MergeAndSort {

    public int[] mergeAndSort(int[] num1, int m, int[] num2, int n) {
        num1 = Arrays.copyOf(num1, m + n);
        int p1 = m - 1;
        int p2 = n - 1;
        for (int p = m + n - 1; p>=0; p--){
            if(p2 < 0){
                break;
            }
            if(p1 >=0 && num1[p1] > num2[p2]){
                num1[p] = num1[p1--];
            }else{
                num1[p] = num2[p2--];
            }
        }
        return num1;
    }
}
