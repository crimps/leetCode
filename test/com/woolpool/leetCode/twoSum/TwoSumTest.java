package com.woolpool.leetCode.twoSum;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest {
    private int[] a = {1, 3, 4, 7, 2, 7, 11, 25};
    private int[] a1 = {0, 4, 3, 0};
    private int[] a2 = {3, 2, 4};
    private int targe = 9;
    private TwoSum twoSum = new TwoSum();

    @Test
    public void testTwoSum() throws Exception {
        int[] b = twoSum.twoSum(a, targe);
        printList(b);
    }

    @Test
    public void testTwoSum_type2() {
        int[] b = twoSum.twoSum_type2(a2, 6);
        printList(b);
    }

    private void printList(int[] list) {
        for (int i : list) {
            System.out.println(i);
        }
    }
}
