package com.vivek.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class BinaryTreeLevelOrderTraverseTest {

    private BinaryTreeLevelOrderTraverse binaryTreeLevelOrderTraverse = new BinaryTreeLevelOrderTraverse();

    @Test
    public void test_BT_LevelOrder_1(){
        List<List<Integer>> levelOrderList = binaryTreeLevelOrderTraverse.levelOrder(null);
        Assert.assertEquals(0, levelOrderList.size());
    }

    @Test
    public void test_BT_LevelOrder_2(){
        TreeNode node = new TreeNode(3, new TreeNode(9, null, null), new TreeNode(20, new TreeNode(15, null, null), new TreeNode(7, null, null)));
        List<List<Integer>> levelOrderList = binaryTreeLevelOrderTraverse.levelOrder(node);
        Assert.assertEquals(3, levelOrderList.size());
    }

    @Test
    public void test_BT_LevelOrder_3(){
        TreeNode node = new TreeNode(3, new TreeNode(9), new TreeNode(20));
        List<List<Integer>> levelOrderList = binaryTreeLevelOrderTraverse.levelOrder(node);
        Assert.assertEquals(2, levelOrderList.size());
    }
}
