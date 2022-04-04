package com.vivek.leetcode;

public class WordSearch {

    char[][] board;
    int rows;
    int cols;

    public boolean exist(char[][] board, String word) {
        this.board = board;
        this.rows = board.length;
        this.cols = board[0].length;
        printBoard();
        for(int row = 0; row < this.rows; row++){
            for(int col = 0; col < this.cols; col++){
                if(backtrack(row, col, word, 0)) return true;
            }
        }
        return false;
    }

    private boolean backtrack(int row, int col, String word, int index) {
        if(index >= word.length()) return true;

        if(row < 0 || row == this.rows || col < 0 || col == this.cols || board[row][col] != word.charAt(index))
            return false;

        board[row][col] = '#';

        boolean ret = false;
        int[] rowOffsets = {0, 1, 0, -1};
        int[] colOffsets = {1, 0, -1, 0};
        for(int d = 0; d < 4; d++){
            ret = backtrack(row + rowOffsets[d], col + colOffsets[d], word, index+1);
            if(ret) break;
        }
        this.board[row][col] = word.charAt(index);
        printBoard();
        return ret;
    }

    public void printBoard(){
        System.out.println("Current State of board : ");
        for(int row = 0; row < this.rows; row++){
            System.out.println();
            for(int col = 0; col < this.cols; col++){
                System.out.print("| " + board[row][col] + " |");
            }
        }
        System.out.println();
    }
}
