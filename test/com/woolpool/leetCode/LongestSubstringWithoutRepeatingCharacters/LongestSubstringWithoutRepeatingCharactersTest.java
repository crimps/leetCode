package com.woolpool.leetCode.LongestSubstringWithoutRepeatingCharacters;

import org.junit.Test;

/**
 *
 */
public class LongestSubstringWithoutRepeatingCharactersTest {
    private String str1 = "aabcdabcdad";
    private String str2 = "bbbbb";

    @Test public void testLengthOfLongestSubstring() throws Exception {
        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
        long start = System.nanoTime();
        longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(str1);
        long end = System.nanoTime();
        System.out.println("total time : " + (end - start) + "ns");
    }
}
