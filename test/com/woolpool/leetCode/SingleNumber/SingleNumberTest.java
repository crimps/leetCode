package com.woolpool.leetCode.SingleNumber;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 模块: [该类所处的模块功能说明]<br>
 * 用途: [该类实现的功能说明]<br>
 * 版权: Copyright (c) 2012-2015 woolpool,Corp.<br>
 * Created by IntelliJ IDEA.
 * User: woolpool
 * Date: 2015/6/14
 * Time: 14:13
 * Email: wzchenxm@163.com
 * 编号：日期：作者：描述<br>
 * -------------------------------------------------------------------------------------<br>
 * 001：2015/6/14：woolpool：gitLog : 新建<br>
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