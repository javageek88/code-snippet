package com.vivek.java8;

public class GenericFunctionalInterface {

    static <T, R> int myCountOperation(T[] array, R input){
        int count = 0;
        for(int i=0; i<array.length; i++){
            if(array[i] == input) count++;
        }
        return count;
    }

    private static CountFunction<String[], String> stringCountFunction = (array, input) -> {
        return myCountOperation(array, input);
    };

    private static CountFunction<Integer[], Integer> numberCountFunction = (array, input) -> {
        return myCountOperation(array, input);
    };

    public static void main(String[] args) {
        String[] colors = new String[]{"red", "yellow", "orange", "red"};
        Integer[] numbers = new Integer[]{1,2,4,5,6,3,1,3,4,1,2,3,4,1};
        System.out.println("count red = " + stringCountFunction.count(colors, "red"));
        System.out.println("count 1 = " + numberCountFunction.count(numbers, 1));
    }


}
interface CountFunction<T, R>{
    int count(T array, R input);
}

class CountOperation{
    static <T, R> int countOp(CountFunction<T, R> function, T array, R input){
        return function.count(array, input);
    }
}
