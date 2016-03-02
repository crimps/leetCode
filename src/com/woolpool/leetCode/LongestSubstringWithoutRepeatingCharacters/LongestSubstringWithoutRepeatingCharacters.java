package com.woolpool.leetCode.LongestSubstringWithoutRepeatingCharacters;

import java.util.Map;
import java.util.TreeMap;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 * For example, the longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3.
 * For "bbbbb" the longest substring is "b", with the length of 1.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    /**
     *
     * @param s characters
     * @return longest number
     */
    public int lengthOfLongestSubstring(String s) {
        int length = 0;
        String[] lists = s.split("");
        Map<Integer, String> treeMap = new TreeMap<Integer, String>();
        for(int i = 0; i < lists.length; i++) {
            for(int j = i + 1; j < lists.length; j++) {
                String subStr = s.substring(i, j);
                int matchCount = 0;
                for(int index = 0; index + j - i < s.length(); index++) {
                    if(s.substring(index, index + j - i).equals(subStr)) {
                        matchCount++;
                    }
                }
                if(matchCount > 1) {
                    treeMap.put(j - i, subStr);
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

        return  length;
    }
}
