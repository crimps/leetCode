package com.woolpool.leetCode.addTwoNumbers;

import org.junit.Test;

/**
 * 模块: [该类所处的模块功能说明]<br>
 * 用途: [该类实现的功能说明]<br>
 * 版权: Copyright (c) 2012-2016 Travelsky,Corp.<br>
 * 编号：日期：作者：描述<br>
 * -------------------------------------------------------------------------------------<br>
 * 001：2016/1/12：陈为泽：SVNlog:新建<br>
 * <br>
 */
public class AddTwoNumbersTest {

    /**
     * 2 -> 4 -> 5
     * 5 -> 6 -> 4
     *
     * 7 -> 0 - > 0 -> 1
     * @throws Exception
     */
    @Test public void testAddTwoNumbers() throws Exception {
        ListNode l1_1 = new ListNode(2);
        ListNode l1_2 = new ListNode(4);
        ListNode l1_3 = new ListNode(5);
        l1_1.next = l1_2;
        l1_2.next = l1_3;

        ListNode l2_1 = new ListNode(5);
        ListNode l2_2 = new ListNode(6);
        ListNode l2_3 = new ListNode(4);
        l2_1.next = l2_2;
        l2_2.next = l2_3;

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode resultList = addTwoNumbers.addTwoNumbers(l1_1, l2_1);
        resultList.printListNode();
    }

    /**
     * 5
     * 5
     *
     * 0 -> 1
     */
    @Test public void testAddTwoNumbers_type2() {
        ListNode l1_1 = new ListNode(5);
        ListNode l2_1 = new ListNode(5);
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode resultList = addTwoNumbers.addTwoNumbers(l1_1, l2_1);
        resultList.printListNode();
    }

    /**
     * 1 -> 8
     * 0
     *
     * 1 -> 8
     */
    @Test public void testAddTwoNumbers_type3() {
        ListNode l1_1 = new ListNode(1);
        l1_1.next = new ListNode(8);
        ListNode l2_1 = new ListNode(0);
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode resultList = addTwoNumbers.addTwoNumbers(l1_1, l2_1);
        resultList.printListNode();
    }

    /**
     * 9 -> 8
     * 1
     *
     * 0 -> 9
     */
    @Test public void testAddTwoNumbers_type4() {
        ListNode l1_1 = new ListNode(9);
        l1_1.next = new ListNode(8);
        ListNode l2_1 = new ListNode(1);
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode resultList = addTwoNumbers.addTwoNumbers(l1_1, l2_1);
        resultList.printListNode();
    }

    /**
     * 1 -> 9
     * 9
     *
     * 0 -> 0 -> 1
     */
    @Test public void testAddTwoNumbers_type5() {
        ListNode l1_1 = new ListNode(1);
        ListNode l2_1 = new ListNode(9);
        l2_1.next = new ListNode(9);
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode resultList = addTwoNumbers.addTwoNumbers(l1_1, l2_1);
        resultList.printListNode();
    }


    @Test public void testPrintListNode() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        l1.next = l2;
        l2.next = l3;

        l1.printListNode();

    }


}
