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


import java.util.ArrayList;
import java.util.List;

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
        boolean carryFlag = false;
        boolean highFlag = false;
        List<ListNode> listNodes = new ArrayList<ListNode>();
        ListNode p1 = l1;
        ListNode p2 = l2;
        for (; null != p1 && null != p2; p1 = p1.next, p2 = p2.next) {

            int value = p1.val + p2.val;
            if (carryFlag) {
                value = value + 1;
                //进位标识清空
                carryFlag = false;
            }

            //进位处理
            if (value > 9) {
                value = value % 10;
                carryFlag = true;
                //高位为空时，新增高位处理
                if (null == p1.next && null == p2.next) {
                    highFlag = true;
                }
            }
            listNodes.add(new ListNode(value));
            if (highFlag) {
                listNodes.add(new ListNode(1));
                //新增高位标识清空
                highFlag = false;
            }
        }
        //处理链表不等长情况
        if (null != p1) {
            for (; null != p1; p1 = p1.next) {
                //进位处理
                if (carryFlag) {
                    p1.val = p1.val + 1;
                }
                listNodes.add(new ListNode(p1.val));
            }
        } else {
            for (; null != p2; p2 = p2.next) {
                //进位处理
                if (carryFlag) {
                    p2.val = p2.val + 1;
                }
                listNodes.add(new ListNode(p2.val));
            }
        }

        for (int i = 0; i < listNodes.size() - 1; i++) {
            listNodes.get(i).next = listNodes.get(i + 1);
        }

        return listNodes.get(0);
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
            if (null != node.next) {
                System.out.print(rightArrow + blank);
            }
        }
    }
}
