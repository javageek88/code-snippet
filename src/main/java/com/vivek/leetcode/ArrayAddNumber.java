package com.vivek.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayAddNumber {

    public List<Integer> addNumber(int[] numberOne, int secondNumber) {
        if(numberOne == null){
            return null;
        }
        int length = numberOne.length;
        int curr = secondNumber;
        int i = length;
        List<Integer> ans = new ArrayList<>();
        while(--i >= 0 || curr > 0 ){
            if(i>=0){
                curr += numberOne[i];
            }
            ans.add(curr % 10);
            curr /= 10;
        }
        Collections.reverse(ans);
        return ans;
    }
}
