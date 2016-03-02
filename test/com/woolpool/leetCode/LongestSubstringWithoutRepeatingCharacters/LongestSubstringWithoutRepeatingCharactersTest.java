package com.woolpool.leetCode.LongestSubstringWithoutRepeatingCharacters;

import org.junit.Test;

/**
 *
 */
public class LongestSubstringWithoutRepeatingCharactersTest {
    private String str1 = "abcabcbb";
    private String str2 = "bbbbb";

    @Test public void testLengthOfLongestSubstring() throws Exception {
        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
        longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(str1);
    }
}
