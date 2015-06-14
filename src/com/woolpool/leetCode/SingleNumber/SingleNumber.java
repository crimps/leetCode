package com.woolpool.leetCode.SingleNumber;

/**
 * Given an array of integers, every element appears twice except for one. Find that single one.

 Note:
 Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

 Hide Tags Hash Table Bit Manipulation

 */
public class SingleNumber {

    public int singleNumber(int[] nums) {

        return 1;
    }

    /**
     * 算法原理测试代码
     */
    public void demo(){
        int x = 101;
        int y = 1;
        int i = x ^ y;
        System.out.print(i);
    }
}
