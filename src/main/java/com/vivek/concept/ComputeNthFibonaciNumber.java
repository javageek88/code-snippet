package com.vivek.concept;

public class ComputeNthFibonaciNumber {

    //1, 1, 2, 3, 5, 8, 13, 21, 34, 55
    public static void main(String[] args) {
        System.out.println("fibo = " + fibo(10));
    }

    private static int fibo(int n){
        if(n==0) return 0;
        else if(n==1) return 1;
        else return fibo(n - 1) + fibo(n - 2); // O(2^n) O(branches ^ depth)
    }
}
