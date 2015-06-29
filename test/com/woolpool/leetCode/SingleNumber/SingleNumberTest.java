package com.woolpool.leetCode.SingleNumber;

import org.junit.Test;

import static org.junit.Assert.*;

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