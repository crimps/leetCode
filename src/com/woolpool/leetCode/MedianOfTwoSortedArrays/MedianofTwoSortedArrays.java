package com.woolpool.leetCode.MedianOfTwoSortedArrays;

import java.util.ArrayList;
import java.util.List;

/**
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * Find the median of the two sorted arrays.
 * The overall run time complexity should be O(log (m+n)).
 */
public class MedianofTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> nums = new ArrayList<>();
        int index1 = 0;
        int index2 = 0;
        for (; index1 < nums1.length && index2 < nums2.length; ) {
            if (nums1[index1] > nums2[index2]) {
                nums.add(nums2[index2]);
                index2 ++;
            } else {
                nums.add(nums1[index1]);
                index1 ++;
            }
        }
        if (index1 < nums1.length) {
            for (; index1 < nums1.length; ) {
                nums.add(nums1[index1]);
                index1 ++;
            }
        }
        if (index2 < nums2.length) {
            for (; index2 < nums2.length; ) {
                nums.add(nums2[index2]);
                index2 ++;
            }
        }
        if (nums.size() % 2 == 0) {
            return (double)(nums.get(nums.size() / 2 - 1) + nums.get(nums.size() / 2)) / 2;
        } else {
            return (double)nums.get((nums.size() + 1) / 2 - 1);
        }
    }
}
