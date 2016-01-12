package com.woolpool.leetCode.addTwoNumbers;

import org.junit.Test;

import static org.junit.Assert.*;

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

    @Test public void testAddTwoNumbers() throws Exception {

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
