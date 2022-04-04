package com.vivek.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class SymmetricTreeTest {

    private SymmetricTree symmetricTree = new SymmetricTree();

    @Test
    public void testIsSymmetricTree_1(){
        TreeNode treeNode = new TreeNode(1);
        Assert.assertTrue(symmetricTree.isSymmetric(treeNode));
    }

    @Test
    public void testIsSymmetricTree_2(){
        TreeNode treeNode = new TreeNode(10);
        treeNode.left = new TreeNode(5);
        treeNode.right = new TreeNode(15);
        Assert.assertFalse(symmetricTree.isSymmetric(treeNode));
    }

    @Test
    public void testIsSymmetricTree_3(){
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(2);
        Assert.assertTrue(symmetricTree.isSymmetric(treeNode));
    }
}
