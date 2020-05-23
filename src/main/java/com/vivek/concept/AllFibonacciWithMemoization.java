package com.vivek.concept;


//Print all fibonacci numbers from 0 to N with memoization- O(n)
public class AllFibonacciWithMemoization {
    public static void main(String[] args) {
        int n = 5;
        int [] memo = new int[n+1];
        for (int i = 0 ; i< n; i++){
            System.out.println("fibo(i) = " + fibo(i, memo));
        }
    }

    private static int fibo(int n, int [] memo){
        if(n==0) return 0;
        else if(n==1) return 1;
        else if (memo[n] > 0) return memo[n];
        else memo[n]  = fibo(n - 1, memo) + fibo(n - 2, memo);
        return memo[n];
    }
}
