package com.woolpool.leetCode.LongestPalindromicSubstring;

/**
 * Given a string S, find the longest palindromic substring in S.
 * You may assume that the maximum length of S is 1000, and there exists one unique longest palindromic substring.
 */
public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {

        return null;
    }

    /**
     * 判断是否是回文
     * @param s 字符串
     * @return true or false
     */
    public boolean isPalindromic(String s) {
        boolean result = true;
        if(s.length() % 2 != 0) {
            for(int index = 0; index < s.length() / 2; index++) {
                if(!String.valueOf(s.charAt(index)).equals(String.valueOf(s.charAt(s.length() - index)))) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
