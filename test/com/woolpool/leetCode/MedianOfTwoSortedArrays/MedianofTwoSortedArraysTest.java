package com.woolpool.leetCode.MedianOfTwoSortedArrays;

import org.junit.Test;

public class MedianOfTwoSortedArraysTest {
    private int[] type1_number1 = {1,2,3,4,5};
    private int[] type1_number2 = {2,3,4,5,6};

    private int[] type2_number1 = {};
    private int[] type2_number2 = {1};

    private int[] type3_number1 = {};
    private int[] type3_number2 = {2, 3};

    private MedianOfTwoSortedArrays medianofTwoSortedArrays = new MedianOfTwoSortedArrays();

    @Test
    public void testFindMedianSortedArrays() throws Exception {
        double result = medianofTwoSortedArrays.findMedianSortedArrays(type1_number1, type1_number2);
        System.out.println(result);

        double result2 = medianofTwoSortedArrays.findMedianSortedArrays(type2_number1, type2_number2);
        System.out.println(result2);

        double result3 = medianofTwoSortedArrays.findMedianSortedArrays(type2_number1, type3_number2);
        System.out.println(result3);
    }
}