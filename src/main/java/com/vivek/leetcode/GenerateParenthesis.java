package com.vivek.leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

    private List<String> result = new ArrayList<>();

    public List<String> generate(int target) {
        if(target == 0) return result;
        generateParenthesis(result, new char[2 * target], 0);
        return result;
    }

    private void generateParenthesis(List<String> result, char[] current, int pos) {
        if(current.length == pos){
            if(isValid(current)){
                result.add(new String(current));
            }
        } else {
            current[pos] = '(';
            generateParenthesis(result, current, pos+1);
            current[pos] = ')';
            generateParenthesis(result, current, pos+1);
        }
    }

    private boolean isValid(char[] current) {
        int balance = 0;
        for(int i = 0; i < current.length; i++){
            if(current[i] == '(') balance++;
            else balance--;
            if(balance < 0) return false;
        }
        return balance == 0;
    }
}
