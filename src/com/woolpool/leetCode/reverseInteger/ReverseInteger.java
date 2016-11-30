/**
 * @(#)com.woolpool.leetCode.reverseInteger.ReverseInteger.java Copyright (c) 2014-2018 crimps
 */
package com.woolpool.leetCode.reverseInteger;

/**
 *
 * @author crimps
 * @version 1.0  16/11/28
 * @modified crimps  16/11/28  <创建>
 */

/**
 * Reverse digits of an integer.

 Example1: x = 123, return 321
 Example2: x = -123, return -321
 */
public class ReverseInteger {
    /**
     * 考虑int类型反转之后溢出情况
     * @param x
     * @return
     */
    public int reverse(int x) {
        StringBuffer reverseSb = new StringBuffer();
        char[] chars = String.valueOf(x).toCharArray();
        if (x >= 0) {
            for(int i = chars.length - 1; i >= 0; i--) {
                reverseSb.append(chars[i]);
            }
        } else {
            reverseSb.append("-");
            for(int i = chars.length - 1; i > 0; i--) {
                reverseSb.append(chars[i]);
            }
        }
        //处理int溢出情况
        long reverseLong = Long.parseLong(reverseSb.toString());
        if (reverseLong > Integer.MAX_VALUE || reverseLong < Integer.MIN_VALUE) {
            return 0;
        } else {
            return Integer.parseInt(reverseSb.toString());
        }
    }
}