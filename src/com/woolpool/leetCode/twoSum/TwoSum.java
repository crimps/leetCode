package com.woolpool.leetCode.twoSum;

import java.util.*;

/**
 * Given an array of integers, find two numbers such that they add up to a specific target number.

 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

 * You may assume that each input would have exactly one solution.

 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 */
public class TwoSum {
    /**
     * 时间复杂度为O(n^2)，空间复杂度为O(1)
     * 解题思路：
     *      嵌套两个循环遍历就是了，感觉好low啊，不过竟然可以通过
     * @param nums
     *          数组
     * @param target
     *          和值
     * @return
     *          数值对应的下标
     */
    public int[] twoSum(int[] nums, int target) {
        int k = 0;
        int y = 0;
        int[] a = new int[2];
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    k = i;
                    y = j;
                    break;
                }
            }
        }
        a[0] = k + 1;
        a[1] = y + 1;
        return  a;
    }

    /**
     * 时间复杂度O(n)
     * 解题思路：
     *      将数组转化为hashMap，key为数值，value为数值下标
     *      遍历数组：
     *          若Map中不包含当前数值，则将key:target - num;value=i添加到Map，target - value表示与之对应的数值，i表示数组下标
     *          若Map中包含当前数值，说明之前有一个数num1，与当前的数值num2是对应的，取出Map中num1记录的下标值及当前的i就是所需的下标值
     * @param nums
     *          数组
     * @param target
     *          和值
     * @return
     *          数值对应的下标
     */
    public int[] twoSum_type2(int[] nums, int target) {
        int[] a = new int[2];
        Map<Integer, Integer> numsMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(numsMap.containsKey(nums[i])) {
                a[0] = numsMap.get(nums[i]) + 1;
                a[1] = i + 1;
            } else {
                numsMap.put(target - nums[i], i);
            }
        }
        return a;
    }

    /**
     * 时间复杂度O(n*log^n)
     * 解题思路：
     *
     * @param nums
     *          数组
     * @param target
     *          和值
     * @return
     *          数值对应的下标
     */
    public int[] twoSum_type3(int[] nums, int target) {
        int[] a = new int[2];

        int head = 0;
        int tail = nums.length - 1;
        //记录数值对应的下标,整数部分来表示数值，小数部分来表示数值的下标值
        double[] numsCopy = new double[nums.length];
        for(int i = 0; i < nums.length; i++) {
            numsCopy[i] = nums[i] + 0.01 * i;
        }
        //排序
        Arrays.sort(numsCopy);
        //遍历数组，双指针夹逼
        while (head < tail) {
            if(Math.floor(numsCopy[head]) + Math.floor(numsCopy[tail]) < target) {
                head++;
            } else if(Math.floor(numsCopy[head]) + Math.floor(numsCopy[tail]) > target) {
                tail--;
            } else {
                //根据数值的小数部分来获取数值下标信息（PS:注意double运算引入的误差消除）
                a[0] = (int)(Math.ceil((numsCopy[head] - Math.floor(numsCopy[head])) * 100)) + 1;
                a[1] = (int)(Math.ceil((numsCopy[tail] - Math.floor(numsCopy[tail])) * 100)) + 1;
                break;
            }
        }

        return a;
    }
}
