package com.woolpool.leetCode.twoSum;

/**
 * 模块: [该类所处的模块功能说明]&lt;br&gt;
 * 用途: [该类实现的功能说明]&lt;br&gt;
 * 版权: Copyright (c) 2012-${year} woolpool,Corp.&lt;br&gt;
 * Created by IntelliJ IDEA.
 * User: woolpool
 * Date: 15/8/24
 * Time: 下午9:24
 * Email: wzchenxm@163.com
 * 版本号:日期:作者:提交标识:说明<br>
 * -------------------------------------------------------------------------------------<br>
 * 001:2015/7/6:woolpool:gitLog:新建<br>
 * <br>
 */

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
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    k = i;
                    y = j;
                    break;
                }
            }
        }
        int[] a = {k + 1, y + 1};
        return  a;
    }

    /**
     * 时间复杂度O(n)
     * 解题思路：
     *
     * @param nums
     *          数组
     * @param target
     *          和值
     * @return
     *          数值对应的下标
     */
    public int[] twoSum_type2(int[] nums, int target) {
        int[] a = new int[2];
        Map<Integer, Integer> numsMap = new HashMap<Integer, Integer>();
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
}
