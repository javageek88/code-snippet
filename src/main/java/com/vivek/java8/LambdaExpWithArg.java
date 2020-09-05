package com.vivek.java8;

public class LambdaExpWithArg {
    static String stringOperation(Function stringReverseFunction, String inputString){
        return stringReverseFunction.func(inputString);
    }
    public static void main(String[] args) {
        System.out.println("reversed = " + stringOperation(n-> {
            String reverse = "";
            for(int i=n.length() - 1; i>=0; i--){
                reverse += n.charAt(i);
            }
            return  reverse;
        }, "hello there"));

        System.out.println("replace spaces = " + stringOperation(n -> n.replaceAll("\\s", ""), "hello there"));
    }
}
