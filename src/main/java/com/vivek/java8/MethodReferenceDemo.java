package com.vivek.java8;

public class MethodReferenceDemo {
    static String stringOperation(Function stringReverseFunction, String inputString){
        return stringReverseFunction.func(inputString);
    }
    public static void main(String[] args) {
        StringOperation stringReverse = new StringOperation();
        System.out.println("reversed = " + stringOperation(stringReverse::stringReverse, "hello there"));

        System.out.println("replace spaces = " + stringOperation(StringOperation::stringReplaceSpaces, "hello there"));
    }
}

class StringOperation{
    public String stringReverse(String n){
        String reverse = "";
        for(int i=n.length() - 1; i>=0; i--){
            reverse += n.charAt(i);
        }
        return  reverse;
    }

    static String stringReplaceSpaces(String n){
        return n.replaceAll("\\s", "");
    }
}
