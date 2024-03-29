package com.vivek.leetcode;

import java.util.Arrays;
import java.util.LinkedList;

public class MergeArrayIntervals {

    public static void main(String[] args) {
        int [][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        display(merge(intervals));
    }

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0])); //o(nlogn)
        LinkedList<int[]> merged = new LinkedList<>();
        for(int[] interval : intervals){
            if(merged.isEmpty() || merged.getLast()[1] < interval[0]){
                merged.add(interval);
            }else{
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }

    static void display(int[][] intervals){
        for (int[] interval : intervals){
            System.out.print("(" + interval[0] + "," + interval[1] + ")");
            System.out.println(",");
        }
    }
}
