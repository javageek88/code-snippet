package com.vivek.leetcode;

public class DiamaterOfBinaryTree {

    private int diameter;

    public int longestDiameter(TreeNode root) {
        diameter = 0;
        findDiameter(root);
        return diameter;
    }

    private int findDiameter(TreeNode root) {
        if(root == null) return 0;

        int left = findDiameter(root.left);
        int right = findDiameter(root.right);

        diameter = Math.max(diameter, left + right);

        return Math.max(left, right) + 1;
    }
}
