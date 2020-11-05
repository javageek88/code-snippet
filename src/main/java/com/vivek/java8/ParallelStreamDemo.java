package com.vivek.java8;

import java.util.Arrays;
import java.util.List;

/**
 * Compute product of square roots of elements in a list
 */
public class ParallelStreamDemo {

    public static void main(String[] args) {
        List<Double> inputList = Arrays.asList(4.0, 25.0);
        System.out.println("inputList = " + inputList);
        System.out.println("computeProductOfSquareRoots(inputList) = " + computeProductOfSquareRoots(inputList));
    }

    public static Double computeProductOfSquareRoots(List<Double> inputList){
        return  inputList.parallelStream()
                .reduce(1.0,
                        (element1 , element2)  -> element1 * Math.sqrt(element2),
                        (element1, element2) -> element1 * element2);
    }
}
