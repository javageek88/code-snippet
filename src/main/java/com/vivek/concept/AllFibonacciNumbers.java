package com.vivek.concept;

//Print all fibonacci numbers from 0 to N - O(2^n)
public class AllFibonacciNumbers {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 0 ; i< n; i++){
            System.out.println("fibo(i) = " + fibo(i));
        }
    }

    private static int fibo(int n){
        if(n==0) return 0;
        else if(n==1) return 1;
        else return fibo(n - 1) + fibo(n - 2); // O(2^n) O(branches ^ depth)
    }

}
