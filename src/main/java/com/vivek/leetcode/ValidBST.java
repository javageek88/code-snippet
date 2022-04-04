package com.vivek.leetcode;

public class ValidBST {

    //1. Recursive traversal
    /*public boolean isValidBST(TreeNode root) {
        return isValid(root, null, null);
    }

    private boolean isValid(TreeNode root, Integer low, Integer high){
        if(root == null) return true;
        if((low !=null && root.val <= low) || (high!=null && root.val >= high)) return false;
        return isValid(root.left, low, root.val) && isValid(root.right, root.val, high);
    }*/

    //2. Recursive Inorder Traversal
    private Integer prev;
    public boolean isValidBST(TreeNode root){
        prev = null;
        return isInorder(root);
    }

    private boolean isInorder(TreeNode root){
        if(root == null) return true;
        if(!isInorder(root.left)) return false;
        if(prev !=null && root.val <= prev) return false;
        prev = root.val;
        return isInorder(root.right);
    }

}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
