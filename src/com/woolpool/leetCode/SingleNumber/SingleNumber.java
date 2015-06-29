package com.woolpool.leetCode.SingleNumber;

/**
 * Given an array of integers, every element appears twice except for one. Find that single one.

 Note:
 Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

 Hide Tags Hash Table Bit Manipulation

 */
public class SingleNumber {

    public int singleNumber(int[] nums) {
        for(int i = 1; i < nums.length; i++){
            nums[i] ^= nums[i-1];
        }
        return nums[nums.length - 1];
    }
}
