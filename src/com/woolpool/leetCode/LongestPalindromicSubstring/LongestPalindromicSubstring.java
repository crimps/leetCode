package com.woolpool.leetCode.LongestPalindromicSubstring;


/**
 * Given a string S, find the longest palindromic substring in S.
 * You may assume that the maximum length of S is 1000, and there exists one unique longest palindromic substring.
 */
public class LongestPalindromicSubstring {

    /**
     * 暴力解法，遍历所有的子串，记录最长的回文子串
     * 时间复杂度：O(n^3)
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
     * 以某一个元素为中心，向两边扩散，记录最长回文子串
     * 时间复杂度：O(n^2)
     * @param s
     * @return
     */
    public String longestPalindrome_type2(String s) {
        String result = "";
        int begin = 0;
        int maxLength = 0;
        if(s.length() == 1) {
            return s;
        }
        for (int index = 1; index < s.length(); index++) {
            //以index为中心的奇数长度回文
            int start = index - 1;
            int end = index + 1;
            while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
                start--;
                end++;
            }
            start ++;
            if (start >= 0 && end <= s.length() && maxLength < (end - start)) {
                begin = start;
                maxLength = end - start;
            }

            //以index为中心的偶数长度回文
            start = index - 1;
            end = index;
            while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
                start --;
                end ++;
            }
            start ++;
            if (start >= 0 && end <= s.length() && maxLength < (end - start)) {
                begin = start;
                maxLength = end -start;
            }


            result = s.substring(begin, begin + maxLength);
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
        for(int index = 0; index < s.length() - index - 1; index++) {
            if(!String.valueOf(s.charAt(index)).equals(String.valueOf(s.charAt(s.length() - index - 1)))) {
                result = false;
                break;
            }
        }
        return result;
    }
}
