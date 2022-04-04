package com.vivek.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class SearchInRotatedArrayTest {

    private SearchInRotatedArray searchInRotatedArray = new SearchInRotatedArray();

    @Test
    public void test_1(){
        int [] array = new int[]{4,5,6,7,0,1,2};
        int target = 0;
        int index = searchInRotatedArray.search(array, target);
        Assert.assertEquals(4, index);
    }

    @Test
    public void test_2(){
        int [] array = new int[]{4,5,6,7,0,1,2};
        int target = 3;
        int index = searchInRotatedArray.search(array, target);
        Assert.assertEquals(-1, index);
    }

    @Test
    public void test_3(){
        int [] array = new int[]{1};
        int target = 0;
        int index = searchInRotatedArray.search(array, target);
        Assert.assertEquals(-1, index);
    }

    @Test
    public void test_4(){
        int [] array = new int[]{3,1};
        int target = 3;
        int index = searchInRotatedArray.search(array, target);
        Assert.assertEquals(0, index);
    }

    @Test
    public void test_5(){
        int [] array = new int[]{1,3};
        int target = 3;
        int index = searchInRotatedArray.search(array, target);
        Assert.assertEquals(1, index);
    }

    @Test
    public void test_6(){
        int [] array = new int[]{3,4,5,6,1,2};
        int target = 2;
        int index = searchInRotatedArray.search(array, target);
        Assert.assertEquals(5, index);
    }

    @Test
    public void test_7(){
        int [] array = new int[]{1};
        int target = 0;
        int index = searchInRotatedArray.search(array, target);
        Assert.assertEquals(-1, index);
    }
}
