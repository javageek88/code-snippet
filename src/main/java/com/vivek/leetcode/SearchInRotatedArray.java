package com.vivek.leetcode;

public class SearchInRotatedArray {
    int[] array;
    int target;

    public int search(int[] array, int target) {
        this.array = array;
        this.target = target;

        if (array.length == 1)
            return this.array[0] == target ? 0 : -1;
        //1. find rotated index
        int rotatedIndex = rotatedIndex(array);
        //if 0 search into all array
        if(array[rotatedIndex] == target) return rotatedIndex;

        if(rotatedIndex == 0){
            return searchTarget(0, array.length - 1);
        }
        if(target < array[0]){
            //search in left array
            return searchTarget(rotatedIndex, array.length - 1);
        }else{
            //search in right array
            return searchTarget(0, rotatedIndex - 1);
        }
        //2. binary search into left or right of the rotated index based on target comparison
        ////3. return index
    }

    private int searchTarget(int left, int right) {
        while(left <= right){
            int mid = (left + right) / 2;
            if(array[mid] == target) return mid;
            else{
                if(array[mid] < target){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    private int rotatedIndex(int[] array) {
        int left = 0;
        int right = array.length - 1;
        if (array[left] < array[right])
            return 0;
        while(left <= right){
            int mid = (left + right) / 2;

            if(array[mid] > array[mid + 1]){
                return mid + 1;
            }else{
                if(array[mid] < array[left]){
                    right = mid - 1;
                }else {
                    left = mid + 1;
                }
            }
        }
        return 0;
    }
}
