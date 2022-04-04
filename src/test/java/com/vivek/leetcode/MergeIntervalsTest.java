package com.vivek.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class MergeIntervalsTest {
    private MergeIntervals mergeIntervals = new MergeIntervals();

    @Test
    public void test_interval_1(){
        int[][] intervals = new int[][]{{1,3}, {2,6}, {8,10}, {15,18}};
        int[][] merged = mergeIntervals.merge(intervals);
        Assert.assertEquals(3, merged.length);
    }
}
