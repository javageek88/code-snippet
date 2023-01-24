package com.vivek.algoexpert;

public class SelectionSort {

    //o(n^2)
    //o(1)
    public int[] selectionSort(int[] array) {
        //select index consider it as min
        //find the index of min element in the array
        //swap elements with index of selected element
        if(array ==null || array.length <= 0 ) return array;
        int startIndex = 0;
        while(startIndex < array.length - 1){
            int smallestElementIndex = startIndex;
            for(int i = startIndex + 1; i < array.length; i++){
                if(array[smallestElementIndex] > array[i]){
                    smallestElementIndex = i;
                }
            }
            swap(startIndex, smallestElementIndex, array);
            startIndex++;
        }
        return array;
    }

    private void swap(int startIndex, int smallestElementIndex, int[] array) {
        int startElement = array[startIndex];
        array[startIndex] = array[smallestElementIndex];
        array[smallestElementIndex] = startElement;
    }
}
