package com.woolpool.leetCode.LongestPalindromicSubstring;

/**
 * Given a string S, find the longest palindromic substring in S.
 * You may assume that the maximum length of S is 1000, and there exists one unique longest palindromic substring.
 */
public class LongestPalindromicSubstring {

    /**
     * 暴力解法，遍历所有的子串，记录最长的回文子串
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {
        String result = "";
        for (int index_x = 0; index_x <= s.length(); index_x++) {
            for (int index_y = index_x; index_y <= s.length(); index_y++) {
                String subStr = s.substring(index_x, index_y);
                if(subStr.length() > result.length() && isPalindromic(subStr)) {
                    result = subStr;
                }
            }
        }
        return result;
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
                if(!String.valueOf(s.charAt(index)).equals(String.valueOf(s.charAt(s.length() - index - 1)))) {
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }
        return result;
    }
}
