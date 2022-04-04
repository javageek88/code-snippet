package com.vivek.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfIslandsTest {

    private NumberOfIslands numberOfIslands = new NumberOfIslands();

    @Test
    public void test_empty_grid_dfs_1(){
        char[][] grid = new char[][]{};
        int count = numberOfIslands.countNumberOfIslands(grid);
        Assert.assertEquals(0, count);
    }

    @Test
    public void test_empty_grid_dfs_2(){
        char[][] grid = new char[][]{{'1','1','1'}, {'0', '1' ,'0'}, {'1', '0', '0'}, {'1', '0', '1'}};
        int count = numberOfIslands.countNumberOfIslands(grid);
        Assert.assertEquals(3, count);
    }

    @Test
    public void test_empty_grid_dfs_3(){
        char[][] grid = new char[][]{{'1','0','1'},
                                    {'0', '1' ,'0'},
                                    {'1', '0', '0'},
                                    {'1', '0', '1'}};
        int count = numberOfIslands.countNumberOfIslands(grid);
        Assert.assertEquals(5, count);
    }

    @Test
    public void test_empty_grid_dfs_4(){
        char[][] grid = new char[][]{{'1','1','1', '1'},
                                    {'0', '1' ,'0', '1'},
                                    {'1', '0', '0', '1'},
                                    {'1', '0', '1', '1'}};
        int count = numberOfIslands.countNumberOfIslands(grid);
        Assert.assertEquals(2, count);
    }

}
