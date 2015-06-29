package com.woolpool.leetCode.SingleNumber;

import org.junit.Test;

public class SingleNumberTest {

    int[] numbers = {1, 2, 3, 1, 2, 5, 5};
    SingleNumber singleNumber = new SingleNumber();

    @Test
    public void testSingleNumber() throws Exception {
        int num = singleNumber.singleNumber(numbers);
        System.out.println(num);
    }

    @Test
    public void testDemo() throws Exception {
        demo();
    }

    /**
     *异或操作
     */
    public void demo(){
        int x = 101;
        int y = 0;
        int i = x ^ y;
        System.out.print(i);
    }
}