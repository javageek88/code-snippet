package com.vivek.algorithm;

public class SelectionSort {
    public static void main(String[] args) {
        //int [] arr = {7, 5, 4, 2};
        int [] arr = {7, 5, 4, 2,1,3,6};
        selectionSort(arr);
        selectionSortWithIndex(arr);
    }

    private static void display(int[] arr) {
        System.out.println("\nSorted Array : ");
        for (int i=0; i<arr.length; i++)
            System.out.print(arr[i]);
    }

    public static void selectionSort(int [] arr){
        int n = arr.length;
        for (int i=0; i<n-1; i++){
            int min = arr[i];
            for (int j=i+1; j<n; j++){
                if(arr[i] > arr[j]){
                    min = arr[j];
                    arr[j] = arr[i];
                    arr[i] = min;
                }
            }
        }
        display(arr);
    }

    public static void selectionSortWithIndex(int[] arr){
        int n = arr.length;
        for(int i= 0; i<n-1; i++){
            int min_index = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
        display(arr);
    }
}
