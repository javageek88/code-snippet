package com.vivek.algorithm;

public class InsertionSort {
    public static void main(String[] args) {
        int[] intArr = {7, 5, 3, 1, 2};
        System.out.println("Unsorted Array - ");
        display(intArr);
//        insertionSort(intArr);

//        anotherInsertionSort(intArr);

        insertionSortRecursive(intArr, intArr.length);

        display(intArr);
    }

    public static void insertionSort(int[] arr) {
        //iteration from i=0 to i<arr.length
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int key_index = i;
            for (int j = i; j < arr.length; j++) {
                if (key > arr[j]) {
                    key = arr[j];
                    key_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[key_index];
            arr[key_index] = temp;
        }
        display(arr);
        //key = arr[i] key_index=i
        //for j=i+1 and j< arr.length - 1
        //if key > arr[i]
        //key = arr[j]
        //key_index = j
        //arr[i] = key
    }

    public static void anotherInsertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        display(arr);
    }

    static void insertionSortRecursive(int arr[], int n)
    {
        // Base case
        if (n <= 1)
            return;

        // Sort first n-1 elements
        insertionSortRecursive( arr, n-1 );
        display(arr);

        // Insert last element at its correct position
        // in sorted array.
        int last = arr[n-1];
        int j = n-2;

        /* Move elements of arr[0..i-1], that are
          greater than key, to one position ahead
          of their current position */
        while (j >= 0 && arr[j] > last)
        {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = last;
    }

    private static void display(int[] intArr) {
        for (int i = 0; i < intArr.length; i++)
            System.out.print(" " + intArr[i]);
        System.out.println();
    }
}
