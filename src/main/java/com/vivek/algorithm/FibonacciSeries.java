package com.vivek.algorithm;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSeries {

    public static void main(String[] args) {
        List<Integer> fibSeries = new ArrayList<>();
        for (int i=0; i<10 ;i++){
            fibSeries.add(fibo(i));
        }
        System.out.println("Generated series : "+ fibSeries.toString());
    }

    private static int fibo(int n){
        if(n <= 1) {
            return n;
        } else {
            return fibo(n-1) + fibo(n-2);
        }
    }
}
