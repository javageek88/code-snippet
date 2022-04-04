package com.vivek.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class RotateImageTest {
    private static RotateImage rotateImage = new RotateImage();

    @Test
    public void testMatrix_1(){
        int[][] input = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[][] result = new int[][]{{7,4,1},{8,5,2},{9,6,3}};
        Assert.assertEquals(result, rotateImage.rotate(input));
    }
}
