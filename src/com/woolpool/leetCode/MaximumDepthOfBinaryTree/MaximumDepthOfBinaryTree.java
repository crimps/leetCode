package com.woolpool.leetCode.MaximumDepthOfBinaryTree;

/**
 * 模块: [该类所处的模块功能说明]<br>
 * 用途: [该类实现的功能说明]<br>
 * 版权: Copyright (c) 2012-2015 woolpool,Corp.<br>
 * Created by IntelliJ IDEA.
 * User: woolpool
 * Date: 2015/6/29
 * Time: 10:25
 * Email: wzchenxm@163.com
 * 编号：日期：作者：描述<br>
 * -------------------------------------------------------------------------------------<br>
 * 001：2015/6/29：woolpool：gitLog : 新建<br>
 * <br>
 */



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
