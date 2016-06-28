package com.woolpool.leetCode.LongestSubstringWithoutRepeatingCharacters;

import java.util.Arrays;
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
     * 简单但是时间复杂度太高
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
     *
     * @param s characcters
     * @return longest number
     */
    public int lengthOfLongestSubstring_type2(String s) {
        int length = 0;
        String[] lists = s.split("");
        Map<String, Integer> charsMap = new HashMap<>();
        for(int start = 0, end = start + 1; end < lists.length;) {
            if(null == charsMap.get(lists[end])) {
                charsMap.put(lists[end], end);
                end++;
            } else {
                if(length < (end - start)) {
                    length = end - start - 1;
                }
                start = charsMap.get(lists[end]);
                end = start + 1;
                charsMap.clear();
            }
        }
        return length;
    }

    /**
     * 新建一个空数组以存储信息，数组值默认为-1，下标为字符的asii码，值为字符的位置
     * 从第一个字符开始，如果字符下标对应的值大于或等于数组中的值，则说明出现了重复的字符，
     * 记录当前不重复字符的长度，然后从开始字符的下一位重新开始计算。
     * 时间复杂度：O(n)
     * @param s characcters
     * @return longest number
     */
    public int lengthOfLongestSubstring_type3(String s) {
        int max = 1;

        if(s.equals("")) {
            return 0;
        }

        int[] countTable = new int[256];
        Arrays.fill(countTable, -1);
        int start = 0;
        int end = 1;
        int length = s.length();
        countTable[s.charAt(start)] = 0;
        while(end < length) {
            if(countTable[s.charAt(end)] >= start) {
                max = Math.max(max, end - start);
                start = countTable[s.charAt(end)] + 1;
            } else {
                countTable[s.charAt(end)] = end;
                end++;
            }
        }
        max = Math.max(max, end - start);
        return max;
    }
}
