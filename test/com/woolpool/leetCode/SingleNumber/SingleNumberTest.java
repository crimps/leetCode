package com.woolpool.leetCode.SingleNumber;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * ģ��: [����������ģ�鹦��˵��]<br>
 * ��;: [����ʵ�ֵĹ���˵��]<br>
 * ��Ȩ: Copyright (c) 2012-2015 woolpool,Corp.<br>
 * Created by IntelliJ IDEA.
 * User: woolpool
 * Date: 2015/6/14
 * Time: 14:13
 * Email: wzchenxm@163.com
 * ��ţ����ڣ����ߣ�����<br>
 * -------------------------------------------------------------------------------------<br>
 * 001��2015/6/14��woolpool��gitLog : �½�<br>
 * <br>
 */
public class SingleNumberTest {

    int[] numbers = {1, 2, 3};
    SingleNumber singleNumber = new SingleNumber();

    @Test
    public void testSingleNumber() throws Exception {
        singleNumber.singleNumber(numbers);
    }

    @Test
    public void testDemo() throws Exception {
        singleNumber.demo();
    }
}