package com.vivek.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {

    //approach 1 - DFS
    /*public int countNumberOfIslands(char[][] grid) {
        if(grid == null || grid.length == 0) return 0;
        int nr = grid.length;
        int nc = grid[0].length;
        int numberOfIslands = 0;
        for(int r = 0; r < nr; r++){
            for(int c = 0; c < nc; c++){
                if(grid[r][c] == '1'){
                    ++numberOfIslands;
                    dfs(grid, r, c);
                }
            }
        }
        return numberOfIslands;
    }

    private void dfs(char[][] grid, int r, int c) {
        int nr = grid.length;
        int nc = grid[0].length;
        if(r < 0 || c < 0 || r >= nr || c >= nc || grid[r][c] == '0') return;

        grid[r][c] = '0';
        dfs(grid, r-1, c);
        dfs(grid, r+1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
    }*/

    //approach 2 - BFS
    public int countNumberOfIslands(char[][] grid) {
        if(grid == null || grid.length == 0) return 0;
        int nr = grid.length;
        int nc = grid[0].length;
        int numberOfIslands = 0;
        for(int r = 0; r < nr; r++){
            for(int c = 0; c < nc; c ++){
                if(grid[r][c] == '1'){
                    ++numberOfIslands;
                    grid[r][c] = '0';
                    Queue<Integer> neighbors = new LinkedList<>();
                    neighbors.add(r * nc + c);
                    while(!neighbors.isEmpty()){
                        int id = neighbors.remove();
                        int row = id / nc;
                        int col = id % nc;
                        if(row - 1 >= 0 && grid[row - 1][col] == '1'){
                            grid[row - 1][col] = '0';
                            neighbors.add((row - 1) * nc + col);
                        }
                        if(row + 1 < nr && grid[row + 1][col] == '1'){
                            grid[row + 1][col] = '0';
                            neighbors.add((row + 1) * nc + col);
                        }
                        if(col - 1 >= 0 && grid[row][col - 1] == '1'){
                            grid[row][col - 1] = '0';
                            neighbors.add(row * nc + col - 1);
                        }
                        if(col + 1 < nc && grid[row][col + 1] == '1'){
                            grid[row][col + 1] = '0';
                            neighbors.add(row * nc + col + 1);
                        }
                    }
                }
            }
        }
        return numberOfIslands;
    }
}
