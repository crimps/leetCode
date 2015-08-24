package com.woolpool.leetCode.twoSum;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest {

    @Test
    public void testTwoSum() throws Exception {
        int[] a = {1, 3, 4, 7, 2, 7, 11, 25};
        int targe = 9;
        TwoSum twoSum = new TwoSum();
        int[] b = twoSum.twoSum(a, targe);
        for(int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}