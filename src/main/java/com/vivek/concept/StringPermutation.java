package com.vivek.concept;

public class StringPermutation {

    public static void main(String[] args) {
        permutation(args[0]);
    }

    private static void permutation(String inputString){
        permutation(inputString, "");
    }

    private static void permutation(String inputString ,String prefix){
        if(inputString.length() == 0){
            System.out.println("permutation String = " + prefix);
        }else{
            for (int i = 0; i<inputString.length() ; i++){
                String remd = inputString.substring(0, i) + inputString.substring(i+1);
                permutation(remd, prefix + inputString.charAt(i));
            }
        }
    }
}
