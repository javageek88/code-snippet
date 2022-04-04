package com.vivek.leetcode;

public class MedianOfTwoSortedArray {

    public double findMedian(int[] a, int[] b) {
        if(a == null) return median(b);
        if(b == null) return median(a);
        int a_len = a.length;
        int b_len = b.length;
        int t_len = a_len + b_len;
        int[] arr = new int[t_len];
        int a_i = 0, b_i = 0;
        int arr_i = 0;
        while(a_i < a_len && b_i < b_len){
            if(a[a_i] <= b[b_i]) {
                arr[arr_i] = a[a_i];
                a_i++;
            }
            else {
                arr[arr_i] = b[b_i];
                b_i++;
            }
            arr_i++;
        }
        arr_i = pushArrayElements(a, a_len, arr, a_i, arr_i);
        pushArrayElements(b, b_len, arr, b_i, arr_i);
        return median(arr);
    }

    private int pushArrayElements(int[] a, int a_len, int[] arr, int a_i, int arr_i) {
        while (a_i < a_len) {
            arr[arr_i++] = a[a_i++];
        }
        return arr_i;
    }

    private double median(int[] arr) {
        int len = arr.length;
        if(len % 2 == 0) return (arr[len / 2 - 1] + arr[len / 2]) / 2.0;
        return arr[len / 2];
    }
}
