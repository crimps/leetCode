package com.woolpool.leetCode.MaximumDepthOfBinaryTree;

/**
 * Given a binary tree, find its maximum depth.

 The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */
public class MaximumDepthOfBinaryTree {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    public int maxDepth_al1(TreeNode root) {
        if(null == root){
            return 0;
        }

        int left = 1 + maxDepth_al1(root.left);
        int right = 1 + maxDepth_al1(root.right);

        return left > right ? left : right;
    }
}
