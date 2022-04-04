package com.vivek.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class WordSearchTest {
    private WordSearch wordSearch = new WordSearch();

    @Test
    public void test_with_1(){
        char[][] board = new char[][]{{'A','B','C','E'},
                                        {'S','F','C','S'},
                                        {'A','D','E','E'}};
        String word = "ABCCED";
        Assert.assertTrue(wordSearch.exist(board, word));
    }
}
