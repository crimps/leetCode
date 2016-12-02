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

    public boolean isPalindrome_type2(int x) {
        //负数都不是回文
        if (x < 0) {
            return false;
        }
        //单位数字都是回文
        if (0 <= x && x <= 9) {
            return true;
        } else {
            for(int i = 0; i < Integer.valueOf(x).toString().length(); i++) {

            }
        }
        return true;
    }
}