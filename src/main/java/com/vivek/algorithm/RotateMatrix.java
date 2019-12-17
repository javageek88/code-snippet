package com.vivek.algorithm;

/**
 * Rotate matrix
 * o(n^2)
 */
public class RotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        for(int i=0; i<4 ; i++){
            for(int j=0 ; j<4; j++){
                matrix[i][j] = i;
            }
        }
        printMatrix(matrix);
        rotateMatrix(matrix);
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for(int i=0; i<4 ; i++){
            for(int j=0 ; j<4; j++){
                System.out.print("  " + matrix[i][j]);
            }
            System.out.println("");
        }
    }

    private static boolean rotateMatrix(int[][] matrix){
        if(matrix.length ==0 || matrix.length!=matrix[0].length) return false;
        int n = matrix.length;
        System.out.println("Matrix Length : "+ n);
        for(int layer=0; layer< n/2; layer++){
            System.out.println("layer -----> "+ layer);
            int first = layer;
            int last = n - 1 - layer;
            System.out.println(" first = " + first + "   last = "+ last);
            for(int i=first; i< last; i++){
                int offset = i - first;
                System.out.println("offset = " + offset);
                int top = matrix[first][i];
                System.out.println(" first = " + first + " i "+i);
                matrix[first][i]=matrix[last-offset][first];
                System.out.println(" last = " + last + " offset "+ offset);
                matrix[last-offset][first]=matrix[last][last-offset];
                matrix[last][last-offset]=matrix[i][last];
                matrix[i][last]=top;
            }
        }
        return true;
    }
}
