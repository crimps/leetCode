package com.woolpool.leetCode.addTwoNumbers;

/**
 * 模块: [该类所处的模块功能说明]&lt;br&gt;
 * 用途: [该类实现的功能说明]&lt;br&gt;
 * 版权: Copyright (c) 2012-2015 woolpool,Corp.&lt;br&gt;
 * Created by IntelliJ IDEA.
 * User: woolpool
 * Date: 15/9/28
 * Time: 下午5:24
 * Email: wzchenxm@163.com
 * 版本号:日期:作者:提交标识:说明<br>
 * -------------------------------------------------------------------------------------<br>
 * 001:15/9/28:woolpool:gitLog:新建<br>
 * <br>
 */


/**
 * You are given two linked lists representing two non-negative numbers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * <p/>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(l1.val + l2.val);
        for(ListNode node1 = l1.next, node2 = l2.next; null != node1; node1 = node1.next, node2 = node2.next) {
            listNode.next = new ListNode(node1.val + node2.val);


        }
        return listNode;
    }
}


/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    /**
     * 打印listNode，以(7->0->8)形式展示
     */
        public void printListNode() {
        String rightArrow = "->";
        String blank = " ";
        for (ListNode node = this; null != node; node = node.next) {
            System.out.print(node.val + blank);
            if(null != node.next) {
                System.out.print(rightArrow + blank);
            }
        }
    }
}
