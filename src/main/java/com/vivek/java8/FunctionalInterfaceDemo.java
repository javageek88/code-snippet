package com.vivek.java8;

public class FunctionalInterfaceDemo {
    private static Function stringReverseFunc = n -> {
        String reverse = "";
        for(int i=n.length() -1; i>=0; i--)
            reverse += n.charAt(i);
        return reverse;
    };

    private static Function stringReplaceSpaces = n -> n.replaceAll("\\s", "");

    public static void main(String[] args) {
        System.out.println("reversed string  = " + stringReverseFunc.func("hello there"));
        System.out.println("replaced spaces string = " + stringReplaceSpaces.func("hello there"));
    }
}

interface Function{
    String func(String inputString);
}
