package com.vivek.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ZigZagTraverseBinaryTreeTest {

    private ZigZagTraverseBinaryTree zigZagTraverseBinaryTree = new ZigZagTraverseBinaryTree();

    @Test
    public void test_zigzag_tree_1(){
        TreeNode root = null;
        List<List<Integer>> nodeList = zigZagTraverseBinaryTree.zigZagTraverse(root);
        Assert.assertEquals(0, nodeList.size());
    }

    @Test
    public void test_zigzag_tree_2(){
        TreeNode root = new TreeNode(3, new TreeNode(9, null, null), new TreeNode(20, null, null));
        List<List<Integer>> nodeList = zigZagTraverseBinaryTree.zigZagTraverse(root);
        Assert.assertEquals(2, nodeList.size());
    }

    @Test
    public void test_zigzag_tree_3(){
        TreeNode root =         new TreeNode(3,
                new TreeNode(9, null, null), new TreeNode(20, new
                                                TreeNode(15, null, null), new TreeNode(7, null, null)));
        List<List<Integer>> nodeList = zigZagTraverseBinaryTree.zigZagTraverse(root);
        Assert.assertEquals(3, nodeList.size());
    }
    
    @Test
    public void test(){
        List<Integer> row =
                new ArrayList<>(3 + 1) {
                    {
                        add(1);
                    }
                };
        System.out.println("res = " + row);
        System.out.println("size = " + row.size());
    }
}
