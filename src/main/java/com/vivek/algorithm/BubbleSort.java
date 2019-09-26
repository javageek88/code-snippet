package com.vivek.algorithm;

public class BubbleSort {
    public static void main(String[] args) {
        int[] intArr = {7, 5, 3, 1, 2};
        System.out.println("Unsorted Array - ");
        display(intArr);
        System.out.println("Bubble Sort 1 - ");
        bubbleSortON2(intArr);
        System.out.println("Bubble Sort 2 - ");
        bubbleSortSavedIteration(intArr);
        System.out.println("Recursive bubble sort - ");
        bubbleSortRecursive(intArr, intArr.length);
        display(intArr);
    }

    private static void bubbleSortON2(int[] intArr) {
        int length = intArr.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (intArr[j] > intArr[j + 1]) {
                    int temp = intArr[j];
                    intArr[j] = intArr[j + 1];
                    intArr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array - ");
        display(intArr);
    }

    private static void display(int[] intArr) {
        for (int i = 0; i < intArr.length; i++)
            System.out.print(" " + intArr[i]);
        System.out.println();
    }

    private static void bubbleSortSavedIteration(int[] intArr) {
        int length = intArr.length;
        boolean swapped;
        for (int i = 0; i < length - 1; i++) {
            swapped = false;
            for (int j = 0; j < length - i - 1; j++) {
                if (intArr[j] > intArr[j + 1]) {
                    int temp = intArr[j];
                    intArr[j] = intArr[j + 1];
                    intArr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
        }
        System.out.println("Sorted Array - ");
        display(intArr);
    }

    public static void bubbleSortRecursive(int[] arr, int n) {
        if (n == 1) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
//        display(arr);
        bubbleSortRecursive(arr, n - 1);
    }
}
