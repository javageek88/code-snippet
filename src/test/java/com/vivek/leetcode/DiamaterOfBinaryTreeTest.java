package com.vivek.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class DiamaterOfBinaryTreeTest {

    private DiamaterOfBinaryTree diamaterOfBinaryTree = new DiamaterOfBinaryTree();


    @Test
    public void test_diameter_with_empty_root(){
        TreeNode root = null;
        int diameter = diamaterOfBinaryTree.longestDiameter(root);
        Assert.assertEquals(0, diameter);
    }

    @Test
    public void test_diameter_1(){
        TreeNode root = new TreeNode(10, new TreeNode(5), new TreeNode(15));
        int diameter = diamaterOfBinaryTree.longestDiameter(root);
        Assert.assertEquals(2, diameter);
    }

    @Test
    public void test_diameter_2(){
        TreeNode root = new TreeNode(10,
                new TreeNode(5, new TreeNode(1, null, null), new TreeNode(6, null, null)), new TreeNode(15, null, null));
        int diameter = diamaterOfBinaryTree.longestDiameter(root);
        Assert.assertEquals(3, diameter);
    }
}
