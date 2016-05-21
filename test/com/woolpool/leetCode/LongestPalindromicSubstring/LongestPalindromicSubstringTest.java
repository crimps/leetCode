package com.woolpool.leetCode.LongestPalindromicSubstring;


/**
 * Created by Administrator on 2016/5/21.
 */
public class LongestPalindromicSubstringTest {
    private String s = "aba";

    @org.junit.Test
    public void testLongestPalindrome() throws Exception {
        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();
        longestPalindromicSubstring.longestPalindrome(s);
    }
}