/**
 * @(#)com.woolpool.leetCode.palindromeNumber.PalindromeNumber.java Copyright (c) 2014-2018 crimps
 */
package com.woolpool.leetCode.palindromeNumber;

/**
 *
 * @author crimps
 * @version 1.0  16/12/2
 * @modified crimps  16/12/2  <创建>
 */

/**
 * Determine whether an integer is a palindrome. Do this without extra space.

 Some hints:
 Could negative integers be palindromes? (ie, -1)

 If you are thinking of converting the integer to string, note the restriction of using extra space.

 You could also try reversing an integer. However, if you have solved the problem "Reverse Integer", you know that the reversed integer might overflow. How would you handle such case?

 There is a more generic way of solving this problem.
 */
public class PalindromeNumber {
    /**
     * 转化为字符串，从首尾各取字符依次比较，直到结束都一样则为回文，否则不为回文
     * 时间复杂度：O(n)
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        //负数都不是回文
        if (x < 0) {
            return false;
        }
        //单位数字都是回文
        if (0 <= x && x <= 9) {
            return true;
        } else {
            String integerStr = String.valueOf(x);
            for(int start_index = 0, end_index = integerStr.length() - 1; start_index < integerStr.length();
                start_index++, end_index--) {
                if (integerStr.charAt(start_index) != integerStr.charAt(end_index)) {
                    return false;
                }
            }
            return true;
        }
    }

    /**
     * 采用取模的方式从最后一位取出数值，组合之后再做比较
     * @param x
     * @return
     */
    public boolean isPalindrome_type2(int x) {
        //负数都不是回文
        if (x < 0) {
            return false;
        }
        //单位数字都是回文
        if (0 <= x && x <= 9) {
            return true;
        } else {
            int temp_x = x;
            int length = Integer.valueOf(x).toString().length();
            double reverseInt = 0;
            for(int i = 0; i < length; i++) {
                int value = temp_x % 10;
                reverseInt = reverseInt + value * Math.pow(10, length - 1 - i);
                temp_x = (temp_x - value)/10;
            }
            if (reverseInt == x) {
                return true;
            } else {
                return false;
            }
        }
    }
}