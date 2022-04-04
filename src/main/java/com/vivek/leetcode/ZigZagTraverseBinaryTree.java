package com.vivek.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ZigZagTraverseBinaryTree {

    //BFS Approach
    /*public List<List<Integer>> zigZagTraverse(TreeNode root) {
        List<List<Integer>> resultNodesList = new ArrayList<>();
        if(root == null) return resultNodesList;

        final LinkedList<TreeNode> queue = new LinkedList<>();
        queue.addLast(root);
        queue.addLast(null);

        LinkedList<Integer> levelList = new LinkedList<>();
        boolean isOrderLeft = true;
        while(!queue.isEmpty()){
            TreeNode currNode = queue.pollFirst();

            if(currNode != null){
                if(isOrderLeft){
                    levelList.addLast(currNode.val);
                } else {
                    levelList.addFirst(currNode.val);
                }
                if(currNode.left != null){
                    queue.addLast(currNode.left);
                }
                if(currNode.right != null){
                    queue.addLast(currNode.right);
                }
            } else {
                //level traverse done
                resultNodesList.add(levelList);
                levelList = new LinkedList<>();
                if(queue.size() > 0){
                    queue.addLast(null);
                }
                isOrderLeft = !isOrderLeft;
            }
        }
        return resultNodesList;
    }*/

    //DFS Approach
    public List<List<Integer>> zigZagTraverse(TreeNode root) {
        List<List<Integer>> results = new ArrayList<>();
        if(root == null) return results;
        dfs(root, 0, results);
        return results;
    }

    private void dfs(TreeNode node, int level, List<List<Integer>> results) {
        if(level >= results.size()){
            List<Integer> levelList = new ArrayList<>();
            levelList.add(node.val);
            results.add(levelList);
        } else {
            if(level % 2 == 0){
                results.get(level).add(node.val);
            } else {
                results.get(level).add(0, node.val);
            }
        }
        if (node.left != null) dfs(node.left, level + 1, results);
        if (node.right != null) dfs(node.right, level + 1, results);
    }
}
