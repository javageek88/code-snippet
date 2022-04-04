package com.vivek.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class ValidBSTTest {
    private static ValidBST validBST = new ValidBST();

    @Test
    public void testValidBST_With_1(){
        TreeNode root = new TreeNode(10);
        Assert.assertTrue(validBST.isValidBST(root));
    }

    @Test
    public void testValidBST_With_2(){
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        Assert.assertTrue(validBST.isValidBST(root));
    }

    @Test
    public void testValidBST_With_fail_1(){
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(15);
        root.right = new TreeNode(8);
        Assert.assertFalse(validBST.isValidBST(root));
    }
}
