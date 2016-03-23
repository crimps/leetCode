package com.woolpool.leetCode.MaximumDepthOfBinaryTree;

import org.junit.Test;

import java.util.Random;

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
//        printBinayTree(root);
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
     * 输出二叉树树状结构
     * @param root
     *          根节点
     * @param root_x
     *          根节点的横坐标
     * @param root_y
     *          根节点的纵坐标
     * @param root_childen_interval
     *          根节点与左、右子树的间隔
     */
    public void printBinayTree(TreeNode root, int root_x, int root_y, int root_childen_interval, String[][] treeString){
        if(null != root){
            int left_child = root_x - root_childen_interval;
            int right_child = root_x + root_childen_interval;

            //打印根节点
            treeString[root_x][root_y] = String.valueOf(root.val);
            //左子树非空，打印左子树连接符
            if(null != root.left){
                treeString[root_x -1][root_y + 1] = "/";
            }
            //右子树非空，打印右子树连接符
            if(null != root.right){
                treeString[root_x + 1][root_y + 1] = "\\";
            }
            //递归打印左子树
            printBinayTree(root.left, left_child, root_y + 2, root_childen_interval, treeString);
            //递归打印右子树
            printBinayTree(root.right, right_child, root_y + 2, root_childen_interval, treeString);

        }
    }

    @Test
    public void testCreateBandyTree(){
        TreeNode root = createBinayTree(10);
        System.out.println(root);
    }

    @Test
    public void testPrintBinaryTree(){
        int dept = 15;
        TreeNode root = createBinayTree(dept);
        String[][] treeString = initTreeString(dept);
        int root_x = 10 * dept / 2;
        int root_y = 0;
        int root_child_interval = 2;
        printBinayTree(root, root_x, root_y, root_child_interval, treeString);
        printTreeString(treeString, dept);
    }

    /**
     * 初始化二叉树二维数组
     * @param dept
     *          二叉树深度
     * @return
     *      初始化二叉树二维数组
     */
    public String[][] initTreeString(int dept) {
        String[][] treeString = new String[10 * dept][ 10 * dept];
        for(int x = 0; x < 10 * dept; x++) {
            for(int y = 0; y < 10 * dept; y++) {
                treeString[x][y] = " ";
            }
        }
        return treeString;
    }

    /**
     * 输出二叉树二维数组
     * @param treeString
     *          二叉树二维数组
     */
    public void printTreeString(String[][] treeString, int dept) {
        for(int x = 0; x < 10 * dept; x++) {
            for(int y = 0; y < 10 * dept; y++) {
                System.out.print(treeString[x][y]);
            }
            System.out.print("\n");
        }
    }
}
