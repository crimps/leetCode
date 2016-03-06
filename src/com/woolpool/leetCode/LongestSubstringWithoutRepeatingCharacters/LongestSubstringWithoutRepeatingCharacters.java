package com.woolpool.leetCode.LongestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 * For example, the longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3.
 * For "bbbbb" the longest substring is "b", with the length of 1.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    /**
     * 列举所有子串情况[n*(n/2)],再判断每一个子串字符都是唯一的[n]
     * 时间复杂度：O(n^3)
     * 简单但是时间复杂度
     *
     * @param s characters
     * @return longest number
     */
    public int lengthOfLongestSubstring(String s) {
        int length = 0;
        String[] lists = s.split("");
        for (int i = 0; i < lists.length; i++) {
            for (int j = i + 1; j < lists.length; j++) {
                String subStr = s.substring(i, j);
                String[] subLists = subStr.split("");
                Map<String, Integer> charMap = new HashMap<>();
                for (String subStrChar : subLists) {
                    charMap.put(subStrChar, 1);
                }

                if(subLists.length == charMap.size() && length < (j - i)) {
                    length = j - i;
                }
            }
        }
        return length;
    }

    /**
     * @param s characcters
     * @return longest number
     */
    public int lengthOfLongestSubstring_type2(String s) {
        int length = 0;
        String[] lists = s.split("");
        Map<String, String> charsMap = new HashMap<>();
        for(int start = 1, end = start + 1; end < lists.length;) {
            if(null == charsMap.get(lists[end])) {
                charsMap.put(lists[end], "true");
            } else {

            }
        }
        return length;
    }
}