package com.woolpool.leetCode.MedianOfTwoSortedArrays;

import org.junit.Test;

public class MedianOfTwoSortedArraysTest {
    private int[] type1_number1 = {1,2,3,4,5};
    private int[] type1_number2 = {2,3,4,5,6};
    private MedianOfTwoSortedArrays medianofTwoSortedArrays = new MedianOfTwoSortedArrays();

    @Test
    public void testFindMedianSortedArrays() throws Exception {
        double result = medianofTwoSortedArrays.findMedianSortedArrays(type1_number1, type1_number2);
        System.out.println(result);
    }
}