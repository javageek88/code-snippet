package com.vivek.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraverse {

    List<List<Integer>> levels = new ArrayList<>();

    //Recursion
    /*
    public List<List<Integer>> levelOrder(TreeNode node) {
        if(node == null) return levels;
        helper(node, 0);
        return levels;
    }

    private void helper(TreeNode node, int level) {
        if(levels.size() == level){
            levels.add(new ArrayList<>());
        }
        levels.get(level).add(node.val);
        if(node.left != null){
            helper(node.left, level + 1);
        }
        if(node.right != null){
            helper(node.right, level + 1);
        }
    }*/

    //Iteration
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return levels;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        while(!queue.isEmpty()){
            levels.add(new ArrayList<>());

            int level_length = queue.size();
            for(int i = 0; i < level_length; i++){
                TreeNode node = queue.remove();
                levels.get(level).add(node.val);
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
            level++;
        }
        return levels;
    }
}
