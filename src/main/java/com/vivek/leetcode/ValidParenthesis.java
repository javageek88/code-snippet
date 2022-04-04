package com.vivek.leetcode;

import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {

    //Map
    private static final Map<Character, Character> map = Map.of('(', ')', '[', ']', '{','}');

    public boolean isValid(String parenthesis) {
        final Stack<Character> stack = new Stack<>();
        for (int i=0; i< parenthesis.toCharArray().length; i++){
            final Character currentChar = parenthesis.charAt(i);
            if(map.containsKey(currentChar)){
                stack.push(map.get(currentChar));
            }else{
                if(stack.isEmpty()) return false;
                final Character stackTop = stack.pop();
                if(stackTop != currentChar){
                    return false;
                }
            }
        }
        if (stack.isEmpty()) return true;
        return false;
    }
}
