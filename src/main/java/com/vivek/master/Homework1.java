package com.vivek.master;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author : Patil, Harshada
 * 1. Dot Product of Two Matrices
 * 2. Matrix Multiplication
 * 3. Find Words in input string
 * 4. Test all above functions and print results
 */
public class Homework1 {

    public static void main(String[] args) {
        System.out.print("1. Dot Product of Two Matrices");
        final double[] aMatrix = new double[]{1,0,0,2,3};
        final double[] bMatrix = new double[]{0,3,0,4,0};
        System.out.print("\nInput Matrix A : ");
        printDotMatrix(aMatrix);
        System.out.print("\nInput Matrix B : ");
        printDotMatrix(bMatrix);
        System.out.print("\nDot Product of Above Matrices is = " + dotProduct(aMatrix, bMatrix));
        System.out.println();
        System.out.print("\n2. Matrix Multiplication");
        double [][] aMat = new double[][]{  {1,1,1},
                                            {2,2,2},
                                            {3, 3,3},
                                            {4,4,4}};
        double [][] bMat = new double[][]{  {1,1,1,1},
                                            {2,2,2,2},
                                            {3,3,3,3}};
        double [][] cMat = new double[aMat.length][bMat[0].length];
        System.out.print("\nA Matrix :");
        System.out.print("\nA Matrix Rows : "+ aMat.length + " Cols : "+ aMat[0].length);
        System.out.println();
        printMatrix(aMat);
        System.out.print("\nB Matrix :");
        System.out.print("\nB Matrix Rows : "+ bMat.length + " Cols : "+ bMat[0].length);
        System.out.println();
        printMatrix(bMat);
        System.out.print("\nMultiplication of Above Two Matrices Is :\n");
        matMultiply(aMat, bMat, cMat);
        System.out.println();
        System.out.print("3. Find Words in input string with comma, space or tabs");
        final String inputLine = "abc,def,ghi jkl    mno     pqr     stu   jadsaa lasda   ,       wxyz";
        System.out.print("\nInput Line is : " + inputLine);
        String[] words = getLineWords(inputLine);
        System.out.print("\nPrinting Words from Above Line : \n");
        Stream.of(words).forEach(System.out::println);
    }

    public static double dotProduct(double[] a, double[] b){
        double product = 0;
        for (int i = 0; i < a.length; i++){
            product = product + a[i] * b[i];
        }
        return product;
    }

    public static void printDotMatrix(double iMatrix[]){
        for (int i =0; i< iMatrix.length; i++){
            System.out.print(" " + iMatrix[i]);
        }
    }

    public static void printMatrix(double iMatrix[][]){
        for (int i =0; i< iMatrix.length; i++){
            for (int j =0; j< iMatrix[0].length; j++){
                System.out.print(" " + iMatrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void matMultiply(double[][] aMat, double[][] bMat, double[][] cMat){
        int row1 = aMat.length, col1 = aMat[0].length;
        int row2 = bMat.length, col2 = bMat[0].length;

        cMat = new double[row1][col2];

        if(row2 != col1){
            System.out.println("Not valid matrix for multiplication");
            return;
        }

        for(int i=0; i<row1; i++){
            for(int j=0; j<col2; j++){
                for(int k=0; k<row2; k++){
                    cMat[i][j] += aMat[i][k] * bMat[k][j];
                }
            }
        }
        printMatrix(cMat);
    }

    public static String[] getLineWords(String line){
        List<String> returnWords = new ArrayList<>();
        final String[] words = line.trim().split("\\s+");
        String regex = ",";
        for (int i = 0; i< words.length; i++){
            returnWords.addAll(Arrays.asList(words[i].split(regex)));
        }
        return returnWords.toArray(new String[returnWords.size()]);
    }
}
