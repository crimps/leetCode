package com.woolpool.leetCode.MaximumDepthOfBinaryTree;

import org.junit.Test;

import java.util.Random;

/**
 * 模块: [该类所处的模块功能说明]<br>
 * 用途: [该类实现的功能说明]<br>
 * 版权: Copyright (c) 2012-2015 woolpool,Corp.<br>
 * Created by IntelliJ IDEA.
 * User: woolpool
 * Date: 2015/6/29
 * Time: 10:27
 * Email: wzchenxm@163.com
 * 编号：日期：作者：描述<br>
 * -------------------------------------------------------------------------------------<br>
 * 001：2015/6/29：woolpool：gitLog : 新建<br>
 * <br>
 */
public class MaximumDepthOfBinaryTreeTest {

    @Test
    public void testMaxDepth() throws Exception {
        MaximumDepthOfBinaryTree maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();
        //随机生成二叉树
        Random random = new Random();
        int dept = random.nextInt(100);
        TreeNode root = createBinayTree(dept);

        //计算二叉树的深度
        int dept_count = maximumDepthOfBinaryTree.maxDepth_al1(root);
        System.out.println("the binaryTree dept is : " + dept_count);
        printBinayTree(root);
    }

    /**
     * 随机生成二叉树
     * @return
     *      根节点
     */
    private TreeNode createBinayTree(int dept){
        if(dept < 0){
            return new TreeNode(0);
        }
        TreeNode root = new TreeNode(dept);

        root.left = createBinayTree(dept - 1);
        root.right = createBinayTree(dept - 1);

        return  root;
    }

    /**
     * 输出二叉树
     * @param root
     *          根节点
     */
    public void printBinayTree(TreeNode root){

    }

    @Test
    public void testCreateBandyTree(){
        TreeNode root = createBinayTree(10);
        System.out.println(root);
    }
}
